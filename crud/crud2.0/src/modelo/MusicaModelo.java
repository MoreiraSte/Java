package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.MusicaVO;

public class MusicaModelo {
	

	public boolean ehCinematecaVazia() {
		
		ArrayList <MusicaVO> cinemateca = null;
		if (cinemateca.isEmpty())
			return true;
		else
			return false;
	}

	public ArrayList<MusicaVO> obterTodasMusicas(){

	ArrayList<MusicaVO> cinemateca = null;
	cinemateca = new ArrayList<MusicaVO>();
	
	String consultaMusicaSql = "SELECT *"
							  + " FROM musica";

	try {

		Class.forName("org.hsqldb.jdbcDriver"); //carrega o driver

		Connection conexao = DriverManager.getConnection(
				"jdbc:hsqldb:file:C:/Users/Valdecir/Desktop/database/Musica;shutdown=true","sa","");

		Statement comando = conexao.createStatement();

		ResultSet resultado = comando.executeQuery(consultaMusicaSql);

		
		
		while (resultado.next())
		{

			// int codigo = resultado.getInt("codigo");
			int codigo = resultado.getInt(1);

			//String nome = resultado.getString("nome");
			String nome = resultado.getString(2);
			
			//String estilo = resultado.getString("estilo");
			String estilo = resultado.getString(3);
			
			//String cantor = resultado.getString("cantor");
			String cantor = resultado.getString(4);
			
			


			MusicaVO m = new MusicaVO(codigo, nome, estilo, cantor);
			
			cinemateca.add(m);
		}	

		resultado.close();
		comando.close();
		conexao.close();
	}
	//exceção para forName - carga do driver	
	catch (ClassNotFoundException e) {
		System.err.println("Erro ao carregar o driver verifique o "
				+ "arquivo-hsqldb.jar no classpath");
		e.printStackTrace();
		//exceção para criacao Statement e execucao do comando
	} 
	catch (SQLException e) {
		System.err.println("Erro ao realizar conexao com o banco "
				+ "verifique a url de conexão");
		e.printStackTrace();
	}

	return cinemateca; //vazia ou nao
}//fim listar

	public String adiciona(MusicaVO novaMusica) {
	
	Connection conexao = null;
	Statement comando = null;
	// adiciona musica  na lista
	

	String insereMusicaSql = "INSERT INTO musica "
					+ "VALUES (" + novaMusica.getCodigo() + " ,  '" + novaMusica.getNome() +  "', '" + novaMusica.getEstilo() +  "', '" + novaMusica.getCantor() +"');";
	
	System.out.print(insereMusicaSql);
	try {

		Class.forName("org.hsqldb.jdbcDriver"); //carrega o driver

		conexao = DriverManager.getConnection(
				"jdbc:hsqldb:file:C:/Users/Valdecir/Desktop/database/Musica;shutdown=true","sa","");

		comando = conexao.createStatement();

		int resultado = comando.executeUpdate(insereMusicaSql);

		System.out.println("Fim da insercao " + resultado );

		comando.close();
		conexao.close();
		return "\n\nMUSICA CRIADA COM SUCESSO!!";
	}

	//exceção para forName - carga do driver	
	catch (ClassNotFoundException e) {
		System.err.println("Erro ao carregar o driver verifique o "
				+ "arquivo-hsqldb.jar no classpath");
		e.printStackTrace();
		//exceção para criacao Statement e execucao do comando
	} catch (SQLException e) {
		System.err.println("Erro ao realizar conexao com o banco "
				+ "verifique a url de conexão");
		e.printStackTrace();
	}

	//retorna a mensagem
	return "\n\nMUSICA NÃO FOI CRIADA!!";
}


// pesquisa musica que tenha o codigo recebido como parametro 
// caso nao exista aluno com este codigo eh retornado null
	public MusicaVO obterMusica(int codigo) {

	MusicaVO musica = null;
	
	String consultaMusicaSql = "SELECT *"
							  + "FROM musica "
							  + "WHERE codigo = " + codigo +";" ;

	try {

		Class.forName("org.hsqldb.jdbcDriver"); //carrega o driver

		Connection conexao = DriverManager.getConnection(
				"jdbc:hsqldb:file:C:/Users/Valdecir/Desktop/database/Musica;shutdown=true","sa","");

		Statement comando = conexao.createStatement();

		ResultSet resultado = comando.executeQuery(consultaMusicaSql);

		while (resultado.next())
		{

			// int codigo = resultado.getInt("codigo");
			int cod = resultado.getInt(1);

			//String nome = resultado.getString("nome");
			String nome = resultado.getString(2);
			
			//String estilo = resultado.getString("estilo");
			String estilo = resultado.getString(3);
			
			//String cantor = resultado.getString("cantor");
			String cantor = resultado.getString(4);
			
		
			musica = new MusicaVO(cod, nome, estilo, cantor);
			
			
		}	

		resultado.close();
		comando.close();
		conexao.close();
	}
	//exceção para forName - carga do driver	
	catch (ClassNotFoundException e) {
		System.err.println("Erro ao carregar o driver verifique o "
				+ "arquivo-hsqldb.jar no classpath");
		e.printStackTrace();
		//exceção para criacao Statement e execucao do comando
	}
	catch (SQLException e) {
		System.err.println("Erro ao realizar conexao com o banco "
				+ "verifique a url de conexão");
		e.printStackTrace();
	}

	return musica; //null ou nao

}
	public String remove(MusicaVO musica) {
		
		Connection conexao = null;
		Statement comando = null;
		// adiciona musica  na lista
		

		String insereMusicaSql = "DELETE FROM musica "
						+ "WHERE codigo = " + musica.getCodigo() + ";";
		try {

			Class.forName("org.hsqldb.jdbcDriver"); //carrega o driver

			conexao = DriverManager.getConnection(
					"jdbc:hsqldb:file:C:/Users/Valdecir/Desktop/database/Musica;shutdown=true","sa","");

			comando = conexao.createStatement();

			int resultado = comando.executeUpdate(insereMusicaSql);

			System.out.println("Fim da remoção " + resultado );

			comando.close();
			conexao.close();
			return "\n\nMUSICA REMOVIDA COM SUCESSO!!";
		}

		//exceção para forName - carga do driver	
		catch (ClassNotFoundException e) {
			System.err.println("Erro ao carregar o driver verifique o "
					+ "arquivo-hsqldb.jar no classpath");
			e.printStackTrace();
			//exceção para criacao Statement e execucao do comando
		} catch (SQLException e) {
			System.err.println("Erro ao realizar conexao com o banco "
					+ "verifique a url de conexão");
			e.printStackTrace();
		}

		//retorna a mensagem
		return "\n\nMUSICA NÃO FOI REMOVIDA!!";
	}
		
	 

	public String alterarMusica(MusicaVO musicaAlterada) {

		MusicaVO musica = obterMusica(musicaAlterada.getCodigo());
			
	
		Connection conexao = null;
		Statement comando = null;
		// adiciona musica  na lista
		

		String insereMusicaSql = "UPDATE musica "
						+ "SET "  + "nome = '"+ musicaAlterada.getNome() + "', estilo = '" + 	musicaAlterada.getEstilo() + "', cantoroubanda = '" + musicaAlterada.getCantor() +"'"
								+ " WHERE codigo = " + musicaAlterada.getCodigo() + ";";
		
		System.out.print(insereMusicaSql);
		
		try {

			Class.forName("org.hsqldb.jdbcDriver"); //carrega o driver

			conexao = DriverManager.getConnection(
					"jdbc:hsqldb:file:C:/Users/Valdecir/Desktop/database/Musica;shutdown=true","sa","");

			comando = conexao.createStatement();

			int resultado = comando.executeUpdate(insereMusicaSql);

			System.out.println("Fim da alteração " + resultado );
			
			comando.close();
			conexao.close();
			
		}
		



		//exceção para forName - carga do driver	
		catch (ClassNotFoundException e) {
			System.err.println("Erro ao carregar o driver verifique o "
					+ "arquivo-hsqldb.jar no classpath");
			e.printStackTrace();
			//exceção para criacao Statement e execucao do comando
		} catch (SQLException e) {
			System.err.println("Erro ao realizar conexao com o banco "
					+ "verifique a url de conexão");
			e.printStackTrace();
		}

		//retorna a mensagem
		return "\n\nMUSICA NÃO FOI ALTERADA!!";
	}
		

	public boolean existeMusica(int codigo) {
		// TODO Auto-generated method stub
		return false;
	}
}

