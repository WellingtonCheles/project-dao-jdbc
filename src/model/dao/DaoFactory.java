package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao creatSellerDao() { // Apenas instanciar uma implementa��o e deixar apenas a interface.
		
		return new SellerDaoJDBC();
	}

}
