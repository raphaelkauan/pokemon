package DAO;

import DTO.PokebolaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PokebolaDAO {

    Connection conn;
    // PreparedStatement é uma forma se fazer uma inserção no banco mais segura, onde você prepara os parametros para serem inseridos.
    PreparedStatement pstm;

    public void cadastrarPokemon(PokebolaDTO objpokeboladto) {
        String sql = "insert into pokebola (nome_pokemon, raridade_pokemon) values (?, ?)";

        // Acessando a class de conexão
        conn = new ConexaoDAO().conectaBD();

        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objpokeboladto.getNome_pokemon());
            pstm.setString(2, objpokeboladto.getRaridade_pokemon());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "PokebolaDAO" + erro);
        }
        
    }

}
