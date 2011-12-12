package com.fly.biz.dao.user;

import java.sql.SQLException;
import java.util.List;

import com.fly.biz.common.model.user.UserDO;



public interface UserDAO {

	  public List<UserDO> getAllUserList();
	  
	  public UserDO getByName(String userName);
	  
	  public UserDO getById(long userId);
	  
	  public void saveUser(UserDO user);
	  
	  public void deleteUser(long userId);
	  
	  public void updateUser(UserDO user);
	
}
