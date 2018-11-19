/**  
 * All rights Reserved, Designed By Android_Robot     
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: CPSHEN     
 * @date:   2018年11月18日 下午3:39:32       
 */ 
package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.entity.User;
import demo.mapper.UserMapper;

/**   
 * @ClassName:  UserService   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author:   CPSHEN
 * @date:   2018年11月18日 下午3:39:32   
 *      
 */
@Service
public class UserService {
	 
	@Autowired
	private UserMapper userMapper;
	
	public List<User> findByName(String name) {
		return userMapper.findUserByName(name);
	}
 
	public User insertUser(User user) {
		userMapper.insertUser(user);
		return user;
	}
	public List<User> ListUser(){
		return	userMapper.ListUser();
	}
	
	
	public int Update(User user){
		return userMapper.Update(user);
	}
	
	public int delete(int id){
		return userMapper.delete(id);
	}


}
