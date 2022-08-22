
import java.sql.DriverManager;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class RemoveAluno {

	public static void main(String[] args) {
	
		Scanner tec = new Scanner(System.in);

		String prontuario;
		

		System.out.print("Entre com o prontuario:");
		prontuario = tec.toString();

		
		String removeAlunosql = "DELETE FROM aluno "
			+  " WHERE prontuario = " + prontuario +";";
		
		try {
			
			Class.forName("org.hsqldb.jdbcDriver"); //carrega o driver
		
			Connection conexao = DriverManager.getConnection(
					"jdbc:hsqldb:file:C:/Users/Valdecir/Desktop/Banco30-11/alunoDB;shutdown=true","sa","");

			Statement comando = conexao.createStatement();
			
			int registrosAfetados = comando.executeUpdate(removeAlunosql);
			
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
			System.err.println("Erro ao realizar conexao com o banco ou consulta ao banco "
				+ "verifique a url de conexão o comando SQL");
			e.printStackTrace();
		}
		
		
	}

}
