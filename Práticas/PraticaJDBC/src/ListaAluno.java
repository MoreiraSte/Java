
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListaAluno {

	// Metodo que obtem os clientes do SGBD e mostra para os dados de cliente
	//uso do comando SQL - SELECT
	public static void main(String[]args)
	{

		String consultaAlunosql = "SELECT nome, prontuario , disciplina,media "
								+ "FROM aluno ";

		try {
			//Etapa 1 - carrega o driver
			Class.forName("org.hsqldb.jdbcDriver"); //carrega o driver

			//Etapa 2 - criando a conexao e obtendo objeto Connection
			Connection conexao = DriverManager.getConnection(
					"jdbc:hsqldb:file:C:/Users/Valdecir/Desktop/Banco30-11/alunoDB;shutdown=true","sa","");

			//Etapa 3 - a partir da conexao obtendo objeto que executa comandos
			//sql no banco - objeto Statement
			Statement comando = conexao.createStatement();

			//Etapa 4 - executando comando SQL com o metodo executeQuery do Statment 
			ResultSet resultado = comando.executeQuery(consultaAlunosql);

			//percorrendo o objeto ResultSet (ArrayList)
			while (resultado.next()) //posiciona na primeiro posicao
			{

				// int codigo = resultado.getInt("num_conta");
				int prontuario = resultado.getInt(1);

				//String nome = resultado.getString("nome");
				String nome = resultado.getString(2);

				String disciplina = resultado.getString(3);

				System.out.println("prontuario: " + prontuario + "  Nome: " + nome + "  disciplina: " + disciplina);
			}	

			System.out.println("Fim da consulta " );

			//Etapa 5 - Fechando o ResultSet Statement e a conexao
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
		} catch (SQLException e) {
			System.err.println("Erro ao realizar conexao com o banco "
					+ "verifique a url de conexão");
			e.printStackTrace();
		}

	}// fim metodo Adiciona

}
