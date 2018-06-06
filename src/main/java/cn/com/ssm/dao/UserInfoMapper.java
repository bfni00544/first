package cn.com.ssm.dao;

import cn.com.ssm.model.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(String autoId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String autoId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}