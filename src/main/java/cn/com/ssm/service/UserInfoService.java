package cn.com.ssm.service;

import cn.com.ssm.model.UserInfo;

/**
 * Created by oneapm on 2018/6/5.
 */
public interface UserInfoService {
    UserInfo selectByPrimaryKey(String autoId);
}
