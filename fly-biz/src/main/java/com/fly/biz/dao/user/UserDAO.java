package com.fly.biz.dao.user;

import java.util.List;

import com.fly.biz.common.model.user.UserDO;

public interface UserDAO {

	  public List<UserDO> getList();
	  
	  public UserDO getByName(String name);
	  
	  public UserDO getById(String id);
	  
	  public void save(UserDO user);
	  
	  public void delete(long id);
	  
	  public void update(UserDO user);
	
}
