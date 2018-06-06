package cn.com.ssm.service;

import cn.com.ssm.dao.UserInfoMapper;
import cn.com.ssm.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by oneapm on 2018/6/5.
 */
@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper mapper;

    @Override
    public UserInfo selectByPrimaryKey(String autoId) {
//        UserInfo user = userInfoDao.findByName(userName);
//        if (user != null && user.getPassword().equals(password)) {
//            return user;
//        }
        return mapper.selectByPrimaryKey(autoId);
    }
}
