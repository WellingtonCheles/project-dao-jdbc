package db;


// Classe que cria uma exceção personalizada.
// Evita de ficar criando o try e o catch

public class DbException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DbException(String msg) {
		super(msg);
		
	}

}
