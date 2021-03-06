package com.qilinxx.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot06DataMybatisApplicationTests {

    @Test
    public void test1(){
        int width = 100;
        int height = 100;
        String s = "你好";

        File file = new File("E:/image.jpg");

        Font font = new Font("Serif", Font.BOLD, 10);
        //创建一个画布
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        //获取画布的画笔
        Graphics2D g2 = (Graphics2D)bi.getGraphics();

        //开始绘图
        g2.setBackground(Color.WHITE);
        g2.clearRect(0, 0, width, height);
        g2.setPaint(new Color(0,0,255));
        g2.fillRect(0, 0, 100, 10);
        g2.setPaint(new Color(253,2,0));
        g2.fillRect(0, 10, 100, 10);
        g2.setPaint(Color.red);


        FontRenderContext context = g2.getFontRenderContext();
        Rectangle2D bounds = font.getStringBounds(s, context);
        double x = (width - bounds.getWidth()) / 2;
        double y = (height - bounds.getHeight()) / 2;
        double ascent = -bounds.getY();
        double baseY = y + ascent;

        //绘制字符串
        g2.drawString(s, (int)x, (int)baseY);

        try {
            //将生成的图片保存为jpg格式的文件。ImageIO支持jpg、png、gif等格式
            ImageIO.write(bi, "jpg", file);
        } catch (
                IOException e) {
            System.out.println("生成图片出错........");
            e.printStackTrace();
        }
    }
}
