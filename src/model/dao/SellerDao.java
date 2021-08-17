package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	
	void insert(Seller obj); // opera��o de inserir no banco de dados o obj.
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id); // opera��o respons�vel de pegar o id e consultar no banco de dados.
	List<Seller> findAll();	// retorna todos os vendedores .

}
