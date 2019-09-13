package com.qilinxx.template3.service.serviceImpl;

import com.qilinxx.template3.domain.mapper.UserFileMapper;
import com.qilinxx.template3.domain.model.UserFile;
import com.qilinxx.template3.domain.model.UserFileExample;
import com.qilinxx.template3.service.UserFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFileServiceImpl implements UserFileService {
    @Autowired
    private UserFileMapper userFileMapper;
    @Override
    public void insertUserFile(UserFile userFile) {
        userFileMapper.insert(userFile);
    }
    @Override
    public UserFile selectUserFileById(String id) {
        return userFileMapper.selectByPrimaryKey(Integer.parseInt(id));
    }

    @Override
    public List<UserFile> selectAllByUserId(String userId) {
        UserFileExample userFileExample=new UserFileExample();
        userFileExample.createCriteria().andUserIdEqualTo(userId);
        List<UserFile> userFileList = userFileMapper.selectByExample(userFileExample);
        return userFileList;
    }

    @Override
    public void deleteUserFile(String id) {
        userFileMapper.deleteByPrimaryKey(Integer.parseInt(id));
    }

}
