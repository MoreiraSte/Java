
	
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


	public class AdicionaNovoAluno {

		public static void main(String[] args) {
			

			String insereAlunoSql = "INSERT INTO aluno "
								+	" VALUES (8,'Maria', 'GEO',9.0); ";
			
			
			
			try {
				
				//Etapa 1 - carrega o driver
				Class.forName("org.hsqldb.jdbcDriver"); 
			
				//Etapa 2 - criando a conexao e obtendo objeto Connection
				Connection conexao = DriverManager.getConnection("jdbc:hsqldb:file:C:/Users/Valdecir/Desktop/Banco30-11/alunoDB;shutdown=true","sa","");

				//Etapa 3 - a partir da conexao obtendo objeto que executa comandos
				//sql no banco - objeto Statement
				Statement comando = conexao.createStatement();
				
				//Etapa 4 - executando comando SQL com o metodo executeUpdate do Statment 
				int registrosAfetados = comando.executeUpdate(insereAlunoSql);
				
				System.out.println("Quantidade de registros afetados = " + registrosAfetados);
			
				
				//Etapa 5 - Fechando o Statement e a conexao
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

			


