package User.web.Userinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import interfaceEx_2.domain.userinfo.UserInfo;
import interfaceEx_2.domain.userinfo.dao.UserInfoDao;
import interfaceEx_2.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import interfaceEx_2.domain.userinfo.dao.oracle.USerInfoOracleDao;

public class UserInfoclient {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties pro = new Properties();
		pro.load(fis);
		
		String dbType =pro.getProperty("DBTYPE");
		
		UserInfo userinfo = new UserInfo();
		userinfo.setUserId("1234");
		userinfo.setPaddword("0000011");
		userinfo.setUserName("kim"); 
		
		UserInfoDao userinfoDao = null;
		
		if(dbType.equals("ORACLE"))
			userinfoDao = new USerInfoOracleDao();
		else if(dbType.equals("MYSQL"))
			userinfoDao = new UserInfoMySqlDao();
		else
			System.out.println("db error");
		
		userinfoDao.inserUserInfo(userinfo);
		userinfoDao.updateUserInfo(userinfo);
		userinfoDao.deleteUserInfo(userinfo);
		
	}

}
