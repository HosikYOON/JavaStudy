package interfaceEx_2.domain.userinfo.dao;

import interfaceEx_2.domain.userinfo.UserInfo;

public interface UserInfoDao {
	
	void inserUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}
