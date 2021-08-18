package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao creatSellerDao() { // Apenas instanciar uma implementa��o e deixar apenas a interface.
		
		return new SellerDaoJDBC(DB.getConnection());
	}

}
