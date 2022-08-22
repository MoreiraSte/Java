
import java.math.BigDecimal;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class AlteraAluno {

	public static void main(String[] args) {
	
		Scanner tec = new Scanner(System.in);

		String prontuario ;
		
		String nome;
		
		String disciplina;
		
		BigDecimal media;
		
		System.out.print("Entre com o prontuario:");
		prontuario = tec.toString();
		
		System.out.print("Entre com a nova media:");
		media = tec.nextBigDecimal();
	
		
		String alteraAlunosql = "UPDATE aluno SET media = " + media
			+  " WHERE prontuario = " + media +";";
		
		try {
			
			//1 Etapa carregar driver
			Class.forName("org.hsqldb.jdbcDriver"); //carrega o driver
		
			// 2 Etapa obter conexao
			Connection conexao = DriverManager.getConnection(
					"jdbc:hsqldb:file:C:/Users/Valdecir/Desktop/Banco30-11/alunoDB;shutdown=true","sa","");

			//3 Obter Statement
			Statement comando = conexao.createStatement();
			
			//4 Executar o comando com executeUpdade
			int registrosAfetados = comando.executeUpdate(alteraAlunosql);
			
			System.out.println("Quantidade de registros afetados = " + registrosAfetados);
		
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
		
		
	}

}