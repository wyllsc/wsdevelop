package br.com.desenv.service.imp;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.desenv.dao.UserDAO;
import br.com.desenv.model.User;
import br.com.desenv.service.UserService;

/**
 * 
 * User Service
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 * 
 */
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {

	// UserDAO is injected...
	UserDAO userDAO;

	/**
	 * Add User
	 * 
	 * @param User
	 *            user
	 */
	@Transactional(readOnly = false)
	@Override
	public void addUser(User user) {
		getUserDAO().addUser(user);
	}

	/**
	 * Delete User
	 * 
	 * @param User
	 *            user
	 */
	@Transactional(readOnly = false)
	@Override
	public void deleteUser(User user) {
		getUserDAO().deleteUser(user);
	}

	/**
	 * Update User
	 * 
	 * @param User
	 *            user
	 */
	@Transactional(readOnly = false)
	@Override
	public void updateUser(User user) {
		getUserDAO().updateUser(user);
	}

	/**
	 * Get User
	 * 
	 * @param int User Id
	 */
	@Override
	public User getUserById(int id) {
		return getUserDAO().getUserById(id);
	}

	/**
	 * Get User List
	 * 
	 */
	@Override
	public List<User> getUsers() {
		return getUserDAO().getUsers();
	}

	/**
	 * Get User DAO
	 * 
	 * @return IUserDAO - User DAO
	 */
	public UserDAO getUserDAO() {
		return userDAO;
	}

	/**
	 * Set User DAO
	 * 
	 * @param UserDAO
	 *            - User DAO
	 */
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
