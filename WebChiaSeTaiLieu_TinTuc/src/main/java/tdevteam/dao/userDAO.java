package tdevteam.dao;

import tdevteam.model.user;

public interface userDAO {

	public void insert(user us);
	public user findByUserId(int idUser);
	
}
