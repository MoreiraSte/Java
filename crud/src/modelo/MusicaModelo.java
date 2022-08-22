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
	
	String consultaMusicaSql = "SELECT codigo, nome, estilo, cantor, ano"
							  + " FROM musica;";

	try {

		Class.forName("org.hsqldb.jdbcDriver"); //carrega o driver

		Connection conexao = DriverManager.getConnection(
				"jdbc:hsqldb:file:C:/Temp/bancodedados/cinemateca;shutdown=true","sa","");

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
			
			//String ano = resultado.getString("ano");
			String ano = resultado.getString(5);


			MusicaVO m = new MusicaVO(codigo, nome, estilo, cantor, ano);
			
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
	// adiciona filme  na lista
	

	String insereMusicaSql = "INSERT INTO musica "
					+ "VALUES (" + novaMusica.getCodigo() + " ,  '" + novaMusica.getNome() +  "', '" + novaMusica.getEstilo() +  "', '" + novaMusica.getCantor() +  "', '" + novaMusica.getAno() +  "');";

	try {

		Class.forName("org.hsqldb.jdbcDriver"); //carrega o driver

		conexao = DriverManager.getConnection(
				"jdbc:hsqldb:file:C:/Temp/bancodedados/cinemateca;shutdown=true","sa","");

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


// pesquisa Filme que tenha o codigo recebido como parametro 
// caso nao exista aluno com este codigo eh retornado null
	public MusicaVO obterMusica(int codigo) {

	MusicaVO musica = null;
	
	String consultaMusicaSql = "SELECT codigo, nome, estilo, cantor, ano "
							  + "FROM musica "
							  + "WHERE codigo = " + codigo +";" ;

	try {

		Class.forName("org.hsqldb.jdbcDriver"); //carrega o driver

		Connection conexao = DriverManager.getConnection(
				"jdbc:hsqldb:file:C:/Temp/bancodedados/cinemateca;shutdown=true","sa","");

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
			
			//String ano = resultado.getString("ano");
			String ano = resultado.getString(5);


			MusicaVO m = new MusicaVO(codigo, nome, estilo, cantor, ano);
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
					"jdbc:hsqldb:file:C:/Temp/bancodedados/cinemateca;shutdown=true","sa","");

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
		// adiciona filme  na lista
		

		String insereMusicaSql = "UPDATE  musica "
						+ "SET codigo = "+ musicaAlterada.getCodigo() + " , nome = '"+ musicaAlterada.getNome() + "' , estilo = '" + 	musicaAlterada.getEstilo() + "', cantor = '" + musicaAlterada.getCantor() +"', ano = '"+ musicaAlterada.getAno()
								+ "' WHERE codigo = " + musicaAlterada.getCodigo() + ";";
					
		try {

			Class.forName("org.hsqldb.jdbcDriver"); //carrega o driver

			conexao = DriverManager.getConnection(
					"jdbc:hsqldb:file:C:/Temp/bancodedados/cinemateca;shutdown=true","sa","");

			comando = conexao.createStatement();

			int resultado = comando.executeUpdate(insereMusicaSql);

			System.out.println("Fim da alteração " + resultado );

			comando.close();
			conexao.close();
			return "\n\nMUSICA ALTERADA COM SUCESSO!!";
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

