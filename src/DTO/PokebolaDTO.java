package DTO;

public class PokebolaDTO {

    private String nome_pokemon, raridade_pokemon;
    private int id_pokemon;

    // Métodos acessores
    public String getNome_pokemon() { // "Get" serve para pegar o valor que contem na variável
        return nome_pokemon;
    }
    
    public void setNome_pokemon(String nome_pokemon) { // "Set" serve para receber o valor e atribuir na variável
        this.nome_pokemon = nome_pokemon;
    }
    
    public String getRaridade_pokemon() {
        return raridade_pokemon;
    }
    
    public void setRaridade_pokemon(String raridade_pokemon) {
        this.raridade_pokemon = raridade_pokemon;
    }

    /**
     * @return o id_pokémon
     */
    public int getId_pokemon() {
        return id_pokemon;
    }

    /**
     * @param id_pokemon o id_pokemon para definir
     */
    public void setId_pokemon(int id_pokemon) {
        this.id_pokemon = id_pokemon;
    }

}
