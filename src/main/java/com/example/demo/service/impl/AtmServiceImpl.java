package com.example.demo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.constants.RtnCode;
import com.example.demo.entity.Atm;
import com.example.demo.repository.AtmDao;
import com.example.demo.service.ifs.AtmService;
import com.example.demo.vo.AtmResponse;

@Service
public class AtmServiceImpl implements AtmService{
	
	@Autowired
	private AtmDao atmDao;

	@Override
	public AtmResponse addInfo(String account, String pwd) {
		if(!StringUtils.hasText(account) || !StringUtils.hasText(pwd)) {
			return new AtmResponse(null,RtnCode.PARAM_ERROR);
	
		}
		if(atmDao.existsById(account)) {
			return new AtmResponse(null, RtnCode.ACCOUNT_EXISTED);
		}
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Atm res = atmDao.save(new Atm(account,encoder.encode(pwd)));
		//¤£¦^¶Ç±K½X
		res.setPwd("");
		return new AtmResponse(res, RtnCode.SUCCESSFUL);
	}

	@Override
	public AtmResponse getBalanceByAccount(String account,String pwd) {
		if(!StringUtils.hasText(account)) {
			return new AtmResponse(null,RtnCode.PARAM_ERROR);
		}
		Optional<Atm> op = atmDao.findById(account);
		if(op.isEmpty()) {
			return new AtmResponse(null,RtnCode.ACCOUNT_NOT_FOUND);
		}
		Atm res = op.get();
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if(!encoder.matches(pwd, res.getPwd())) {
			return new AtmResponse(null,RtnCode.SUCCESSFUL);
		}
		res.setPwd("");
		return new AtmResponse(res,RtnCode.SUCCESSFUL);
	}

	@Override
	public AtmResponse updatePwd(String account, String oldPwd, String NewPwd) {
		if(!StringUtils.hasText(account)||!StringUtils.hasText(oldPwd)||!StringUtils.hasText(NewPwd)) {
			return new AtmResponse(null,RtnCode.PARAM_ERROR);
		}
		Optional<Atm> op = atmDao.findById(account);
		if(op.isEmpty()) {
			return new AtmResponse(null,RtnCode.ACCOUNT_NOT_FOUND);
		}
		Atm res = op.get();
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if(!encoder.matches(oldPwd, res.getPwd())) {
			return new AtmResponse(null,RtnCode.PARAM_ERROR);
		}
		res.setPwd(encoder.encode(NewPwd));
		atmDao.save(res);
		res.setPwd("");
		return new AtmResponse(res,RtnCode.SUCCESSFUL);
	}

	@Override
	public AtmResponse dispoite(String account, String pwd, int amount) {
		if(!StringUtils.hasText(account)||!StringUtils.hasText(pwd)||amount < 0) {
			return new AtmResponse(null,RtnCode.PARAM_ERROR);
		}
		Optional<Atm> op = atmDao.findById(account);
		if(op.isEmpty()) {
			return new AtmResponse(null,RtnCode.ACCOUNT_NOT_FOUND);
		}
		Atm res = op.get();
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if(!encoder.matches(pwd, res.getPwd())) {
			return new AtmResponse(null,RtnCode.PARAM_ERROR);
		}
		res.setBalance(res.getBalance()+amount );
		atmDao.save(res);
		res.setPwd("");
		return new AtmResponse(res,RtnCode.SUCCESSFUL);
	}

	@Override
	public AtmResponse withdraw(String account, String pwd, int amount) {
		if(!StringUtils.hasText(account)||!StringUtils.hasText(pwd)) {
			return new AtmResponse(null,RtnCode.PARAM_ERROR);
		}
		Optional<Atm> op = atmDao.findById(account);
		if(op.isEmpty()) {
			return new AtmResponse(null,RtnCode.ACCOUNT_NOT_FOUND);
		}
		Atm res = op.get();
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if(!encoder.matches(pwd, res.getPwd())) {
			return new AtmResponse(null,RtnCode.PARAM_ERROR);
		}
		if(amount <0 || amount > res.getBalance()) {
			res.setPwd("");
			return new AtmResponse(null,RtnCode.INSUFFCIENT_BALANCE);
		}
		res.setBalance(res.getBalance()-amount);
		atmDao.save(res);
		res.setPwd("");
		return new AtmResponse(res,RtnCode.SUCCESSFUL);
	}

	
	

}
