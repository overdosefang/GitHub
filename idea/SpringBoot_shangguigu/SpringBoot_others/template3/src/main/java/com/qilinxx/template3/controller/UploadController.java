package com.qilinxx.template3.controller;

import com.qilinxx.template3.configure.WebConst;
import com.qilinxx.template3.domain.model.UserFile;
import com.qilinxx.template3.service.UserFileService;
import com.qilinxx.template3.util.UploadUtil;
import net.minidev.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Controller
public class UploadController {
    @Autowired
    private UserFileService userFileService;
    //记录器
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 来到用户上传信息页面
     * @return
     */
    @GetMapping("upload")
    public String upload(){
        return "upload";
    }
    /**
     *  处理上传页面提交的信息
     * @return 另一个页面
     */
    @PostMapping("upload")
    public String upload(String vcode, MultipartFile file, HttpSession session) throws IOException {
        String sessionVcode = (String) session.getAttribute(WebConst.SESSION_IDENTIFY_CODE);
        if(vcode.toLowerCase().equals(sessionVcode.toLowerCase())){
            logger.info("验证码正确！");
        }else {
            logger.info("验证码错误！");
        }

        if (file.isEmpty()) {
            logger.info("文件为空");
            return "redirect:/success";
        }

        //// 获取文件名
        //String fileName = file.getOriginalFilename();
        //logger.info("上传的文件名为：" + fileName);
        //// 获取文件的后缀名
        //String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //logger.info("上传的后缀名为：" + suffixName);

        String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename(); //生成动态文件名

        String path = UploadUtil.getUploadFilePath() + "/upload";//存储的根路径
        //保存文件
        File targetFile = new File(path, fileName);
        FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(targetFile));

        UserFile userFile=new UserFile();
        userFile.setUserId("11111111111111111111111111111111");
        userFile.setName("张三的图片");
        userFile.setPath("upload\\"+fileName);
        userFile.setType(fileName.substring(fileName.lastIndexOf(".") + 1));
        userFileService.insertUserFile(userFile);
        return "redirect:/success";
    }

    /**
     *
     * @return 到成功页面
     */
    @GetMapping("success")
    public String success(Model model){
        List<UserFile> userFileList = userFileService.selectAllByUserId("11111111111111111111111111111111");
        model.addAttribute("userFileList",userFileList);
        return "success";
    }
    /**
     * ajax删除指定照片
     */
    @PostMapping("ajax-delete-pic")
    @ResponseBody
    public JSONObject ajaxDeletePic(String id ){
        JSONObject json=new JSONObject();
        UserFile userFile = userFileService.selectUserFileById(id);
        String path=UploadUtil.getUploadFilePath()+"/"+userFile.getPath();
        File file = new File(path);
        if (file.exists()) {
            if (file.delete()) {
                json.put("msg","删除成功！");
            } else {
                json.put("msg","删除失败！");
            }
        } else {
            json.put("msg","文件不存在！");
        }
        userFileService.deleteUserFile(id);
        return json;
    }
    @GetMapping("test")
    public String test(){
        return "test";
    }

}
