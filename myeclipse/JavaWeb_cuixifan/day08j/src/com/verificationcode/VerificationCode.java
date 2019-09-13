package com.verificationcode;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import cn.itcast.vcode.utils.VerifyCode;

public class VerificationCode {
public static void main(String[] args) throws Exception {
	VerifyCode verifyCode=new VerifyCode();
	
	BufferedImage bi=verifyCode.getImage();
	
	System.out.println(verifyCode.getText());
	
	VerifyCode.output(bi,new FileOutputStream("E:/a.jpg"));
}
}
