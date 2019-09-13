package cn.itcase.image;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Test;

import cn.itcast.vcode.utils.VerifyCode;

public class DemoVerifyCode {
@Test
public void Test() throws Exception, IOException{
	BufferedImage bi=new BufferedImage(70, 35,BufferedImage.TYPE_INT_BGR);//缓冲区    相当于画板
	
	Graphics2D g=(Graphics2D)bi.getGraphics();// 绘制环境  相当于画笔
	
	g.setColor(Color.WHITE); //设置背景为白色
	g.fillRect(0, 0, 70, 35);
	
	g.setColor(Color.RED);  //写上红色字符串
	g.drawString("hello", 12,30);
	
	ImageIO.write(bi, "JPEG", new FileOutputStream("E:/b.jpg"));
	
}
}
