package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	
	void insert(Department obj); // opera��o de inserir no banco de dados o obj.
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id); // opera��o respons�vel de pegar o id e consultar no banco de dados.
	List<Department> findAll();	// retorna todos os departamentos.
		
		
	}


