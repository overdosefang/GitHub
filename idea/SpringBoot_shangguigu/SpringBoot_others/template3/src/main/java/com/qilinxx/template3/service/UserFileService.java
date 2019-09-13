package com.qilinxx.template3.service;

import com.qilinxx.template3.domain.model.UserFile;

import java.util.List;

public interface UserFileService {
    /**插入一条用户文件*/
    void insertUserFile(UserFile userFile);
    /**根据id查找一条记录*/
    UserFile selectUserFileById(String id);
    /**根据userId查找所有记录*/
    List<UserFile> selectAllByUserId(String userId);
    /**删除一条记录 */
    void deleteUserFile(String id);

}
