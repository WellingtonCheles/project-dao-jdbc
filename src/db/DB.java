package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {

	private static Connection conn = null; // Conexão com o banco de dados
											// O connection é um objeto de conexão com o banco de dados do jdbc;

	public static Connection getConnection() { // Método para gerar conexão com o banco de dados.

		if (conn == null) {

			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl"); // Pega a url
				conn = DriverManager.getConnection(url, props); // Conecta com o banco de dados
			}

			catch (SQLException e) {

				throw new DbException(e.getMessage());

			}

		}

		return conn;

	}

	public static void closeConnection() { // Método para fechar o banco de dados ou conexão

		if (conn != null) { // Se haver uma instanciação, vai fechar o banco de dados

			try {
				conn.close();

			}

			catch (SQLException e) {

				throw new DbException(e.getMessage());

			}
		}

	}

	private static Properties loadProperties() { // Método para carregar as propriedades do arquivo db.properties

		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		}

		catch (IOException e) {

			throw new DbException(e.getMessage());
		}
	}

	public static void closeStatement(Statement st) {

		if (st != null) {

			try {

				st.close();

			} catch (SQLException e) {

				throw new DbException(e.getMessage());
			}

		}

	}

	public static void closeResultSet(ResultSet rs) {

		if (rs != null) {

			try {

				rs.close();

			} catch (SQLException e) {

				throw new DbException(e.getMessage());
			}

		}
	}

}
