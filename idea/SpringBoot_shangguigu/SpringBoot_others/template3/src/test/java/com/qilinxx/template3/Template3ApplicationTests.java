package com.qilinxx.template3;

import com.qilinxx.template3.domain.mapper.UserFileMapper;
import com.qilinxx.template3.domain.mapper.UserMapper;
import com.qilinxx.template3.domain.model.UserFile;
import com.qilinxx.template3.service.UserService;
import com.qilinxx.template3.util.DateKit;
import com.qilinxx.template3.util.UUID;
import com.qilinxx.template3.util.UploadUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Template3ApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserFileMapper userFileMapper;
    @Autowired
    UserService userService;
    @Test
    public void testVo() {
        //List<User> users = userMapper.selectByExample(null);
        //User user = users.get(0);

        UserFile userFile = userFileMapper.selectByPrimaryKey(17);
       // UserFile userFile = userFileMapper.findNameByUserId(u.get());
        //User name = userMapper.findName(userFile.getUserId());
       // userFile.setUsername(name.getUsername());
        System.out.println(userFile);
    }
    @Test
    public void testMapper(){
        System.out.println(userService.getUserByName("张三"));
    }
    @Test
    public void testTool(){
        //两种uuid
        System.out.println("工具包26位UUID："+UUID.UU32());
        System.out.println("手打的32位UUID："+ java.util.UUID.randomUUID().toString().replace("-",""));
        System.out.println("工具包10位时间戳(long):"+ DateKit.getUnixTimeLong());
        System.out.println("工具包10位时间戳(int):"+DateKit.getCurrentUnixTime());
        System.out.println("手打的13位时间戳(long):"+System.currentTimeMillis());
        System.out.println("重复执行结果一样"+System.currentTimeMillis());
    }
    @Test
    public void testList(){
        //list去重
        List list = new ArrayList();
        list.add(26);
        list.add(39);
        list.add(5);
        list.add(40);
        list.add(39);
        list.add(25);
        System.out.println(list);
        List newList = (List) list.stream().distinct().collect(Collectors.toList());
        System.out.println("java8新特性stream去重:"+newList);
    }
    @Test
    public void testString(){
        String s="a.jpg";
        String substring = s.substring(0, s.lastIndexOf("."));
        System.out.println(substring);
    }
    @Test
    public void testParentPath(){
// 获取相对路径
        File file = new File("D:/wzy/a.txt");
        String parentPath = file.getParent(); // D:\wzy
        System.out.println("parentPath="+parentPath);
        File parentDir = file.getParentFile(); // D:\wzy
        System.out.println("parentDir="+parentDir);
    }
    @Test
    public void testUpdateTime(){
        File f = new File("upload\\1548579125903_a.jpg");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(f.lastModified());
        System.out.println(sdf.format(cal.getTime()));
    }
    @Test
    public void testDouHao(){
        //测试中文逗号和英文逗号是否相同
        System.out.println(",".equals("，"));
    }
    @Test
    public void testDir(){
        String path= UploadUtil.getUploadFilePath() + "/upload//20141512//temp//project//a.txt";
        File dirFile=new File(path);
        System.out.println("创建文件之前判断是否为目录："+dirFile.isDirectory());
        System.out.println("是否成功创建："+dirFile.mkdirs());
        System.out.println("创建文件之后判断是否为目录："+dirFile.isDirectory());
    }
    @Test
    public void testStr(){
        String str="q w e, 请问去玩， select ,  分看电视，附件  ";
        System.out.println(str.replace("，",",").replace(" ",""));
    }
    @Test
    public void testDateKit(){
        long time=1550937600;

        System.out.println( DateKit.formatDateByUnixTime(time,"YYYY-MM-DD"));
    }
}