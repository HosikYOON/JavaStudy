package interfaceEx_2.domain.userinfo.dao.oracle;

import interfaceEx_2.domain.userinfo.UserInfo;
import interfaceEx_2.domain.userinfo.dao.UserInfoDao;

public class USerInfoOracleDao implements UserInfoDao{

	@Override
	public void inserUserInfo(UserInfo userInfo) {
		System.out.println("Insert into Oracle DB userID = " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Insert into Oracle DB userID = " + userInfo.getUserId());
	
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Insert into Oracle DB userID = " + userInfo.getUserId());
	
	}

}
