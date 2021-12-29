package br.com.bmbwebtest.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import br.com.bmbwebtest.utils.PageObjectUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import cucumber.api.PendingException;

public class DataBase {
	
	private static Logger log = null;
	
	static {
        System.setProperty("java.util.logging.SimpleFormatter.format", "[%4$-7s] %5$s %n");
        log =Logger.getLogger(DataBase.class.getName());
    }

	public static Connection DataBaseConnect(String Nproposta) throws Exception {
		log.info("Carregando propriedades!!!");
		Connection conn = null;
		
//		String driver = "com.mysql.cj.jdbc.Driver";
//		String url = "jdbc:sqlserver://Q800B007\\NS15_Projeto;databaseName=master;integratedSecurity=true";
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:sqlserver://Q800B007\\NS15_Projeto;databaseName=dtb_bmbdigital";
		String user = "scontrol";
		String password = "control";
		
		try {
			Class.forName(driver);
			log.info("Conectando banco de dados!!");
			conn = DriverManager.getConnection(url,user,password);
			log.info("Teste de conexão com banco de dados: " + conn.getCatalog());
						
			if (Nproposta.isEmpty() || Nproposta == null) {
	            System.out.println("Proposta é uma string Vazia!!!");
	            throw new PendingException();
			} else {
	            System.out.println("Proposta não é uma string Vazia!!!");
//	            String query = "select cod_propo, dat_propo, cod_user, des_prime_conta_clien from dtb_credito..tbl_proposta where cod_propo ="+"'"+Nproposta+"'";
	            String query = "UPDATE dtb_credito..tbl_proposta SET cod_statu = 'APR', tip_fase_propo = 'DSP', dat_situa_regis = dat_situa_regis, cod_user = cod_user WHERE cod_propo ="+"'"+Nproposta+"'";
	            log.info("Preparando instancias!!!");
	            Statement statement = conn.createStatement();
	            
	            if (statement.executeQuery(query) != null) {
//	            	log.info("Proposta: "+Nproposta+" APROVADA!!");
//	            	ResultSet rs = statement.getResultSet();
	            	System.out.println("Proposta: "+Nproposta+" APROVADA!!"); 
//	            	while (rs.next()) {
//	            		String cod_propo = rs.getString("cod_propo");
//	            		String dat_propo = rs.getString("dat_propo");
//	            		String cod_user = rs.getString("cod_user");
//	            		String des_prime_conta_clien = rs.getString("des_prime_conta_clien");
//	            		System.out.println("| " + cod_propo + " | " + dat_propo + " | " + cod_user + " | " + des_prime_conta_clien + " |\n");
//	            	}
	            	
	            }

			}
			
		} catch (ClassNotFoundException e) {
    		// Erro caso o driver JDBC não foi instalado
			log.info("Erro de driver\n: " + e);
//			System.out.println("Erro de driver\n"+e);
   			e.printStackTrace();
		} catch (SQLException ex) {
    		// Erro caso haja problemas para se conectar ao banco de dados
			log.info("Erro de Conexão\n: " + ex);
//			System.out.println("Erro de Conexão\n"+ex);
			ex.printStackTrace();
		}
		
		log.info("Fechando conexão com banco de dados!!!");
		conn.close();
		log.info("Conexão com banco de dados FECHADA!!!");
		return conn;
	}

}