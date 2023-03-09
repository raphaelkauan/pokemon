package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoDAO {

    public Connection conectaBD() { // Método conectaBD
        Connection conn = null; // conn é minha variável de conexão

        try { // jdbc é uma API para que o Java consiga acessar o banco de dados
            String url = "jdbc:mysql://localhost:3306/captura_pokebola?user=root&password=kauan639123321";
            conn = DriverManager.getConnection(url);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
        } // JOptionPane é uma classe que possibilita a criação de uma caixa de dialogo padrão
        return conn;
    }

}
