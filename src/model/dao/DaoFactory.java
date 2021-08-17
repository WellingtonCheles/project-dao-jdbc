package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao creatSellerDao() { // Apenas instanciar uma implementação e deixar apenas a interface.
		
		return new SellerDaoJDBC();
	}

}
