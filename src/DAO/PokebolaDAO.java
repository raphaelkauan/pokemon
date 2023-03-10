package DAO;

import DTO.PokebolaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PokebolaDAO { // Minha class começa aqui

    // conn é minha variável de conexão
    Connection conn;
    // PreparedStatement é uma forma se fazer uma inserção no banco mais segura, onde você prepara os parametros para serem inseridos.
    PreparedStatement preparedStatement;

    // ResultSet permite percorrermos um DataTable de alguma consulta em um banco de dados.
    ResultSet rs;
    // ArrayList é uma classe para coleções
    ArrayList<PokebolaDTO> lista = new ArrayList<>();

    public void cadastrarPokemon(PokebolaDTO objpokeboladto) {
        String sql = "insert into captura_pokebola (nome_pokemon, raridade_pokemon) values (?, ?)";

        // Acessando a class de conexão
        conn = new ConexaoDAO().conectaBD();

        try {

            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, objpokeboladto.getNome_pokemon());
            preparedStatement.setString(2, objpokeboladto.getRaridade_pokemon());

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Pokemon Cadastrar" + erro);
        }

    }

    public ArrayList<PokebolaDTO> pesquisarPokemon() {
        String sql = "select * from captura_pokebola";
        conn = new ConexaoDAO().conectaBD();

        try {

            preparedStatement = conn.prepareStatement(sql);
            rs = preparedStatement.executeQuery();

            // Enquanto estiver linha eu vou repetir
            while (rs.next()) {
                PokebolaDTO objpokebolaDTO = new PokebolaDTO();
                objpokebolaDTO.setId_pokemon(rs.getInt("id_pokemon"));
                objpokebolaDTO.setNome_pokemon(rs.getString("nome_pokemon"));
                objpokebolaDTO.setRaridade_pokemon(rs.getString("raridade_pokemon"));

                lista.add(objpokebolaDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Pokemon Pesquisar" + erro);
        }
        return lista;
    }

}
