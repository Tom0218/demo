package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//�Psrc/main�M�׵L����springboot���ѽ�
//�ΨӪ�B����src/main�O�_�ŦX�ݨD�A�o�K�Τ���
//@SpringBootTest 
public class DemoApplicationTests {
	//@Test���{���X�i�H��W�h�]
	@Test  
	//�@��ӻ��v���L�k��M�װ��D�S���k
	//�v��+�^�Ǹ�ƫ��A+��k�W��
	//�btest����ƫ��A�@�w�Ovoid
	//�p�A�����ηN�O���A�a�ѼơA�j�A���O�޿�϶��@�Ӷ���
	//java�b��ƹw�]��ƫ��A��int
	//�B�I�ƹw�]double
	//���L�C�X�{���p1.�ŧi�F���S�ϥ�
	public void fitstTest() {
		int a = 5;
		/////////long��ƫ᭱��i��long�A+L
		long b = 1234567890434453464L;
		System.out.println(a);
		
		//�ŧi���O��k new ���O����()
		String str = new String("abc");
		String str1 = "ABC";
		System.out.println("str: "+str);
		System.out.println("str: "+str1);
		System.out.println(str + str1);
	}
	

}
