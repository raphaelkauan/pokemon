package DTO;

public class PokebolaDTO {
    private String nome_pokemon, raridade_pokemon;

    // Métodos acessores
    public String getNome_pokemon() { // Get serve para pegar o valor que contem na variável
        return nome_pokemon;
    }
    
    // Set serve para armazenar um valor na variável privada
    public void setNome_pokemon(String nome_pokemon) { 
        this.nome_pokemon = nome_pokemon;
    }

    public String getRaridade_pokemon() {
        return raridade_pokemon;
    }

    public void setRaridade_pokemon(String raridade_pokemon) {
        this.raridade_pokemon = raridade_pokemon;
    }
    
    
}
