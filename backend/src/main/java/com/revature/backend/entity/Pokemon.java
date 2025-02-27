package com.revature.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pokemon")
public class Pokemon
{
    @Id
    private int pokemonId;

    private String pokemonName;

    private String spriteURL;

    // boilerplate---------------------


    public Pokemon()
    {
    }

    public Pokemon(int pokemonId, String pokemonName, String spriteURL)
    {
        this.pokemonId = pokemonId;
        this.pokemonName = pokemonName;
        this.spriteURL = spriteURL;
    }

    public int getPokemonId()
    {
        return pokemonId;
    }

    public void setPokemonId(int pokemonId)
    {
        this.pokemonId = pokemonId;
    }

    public String getPokemonName()
    {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName)
    {
        this.pokemonName = pokemonName;
    }

    public String getSpriteURL()
    {
        return spriteURL;
    }

    public void setSpriteURL(String spriteURL)
    {
        this.spriteURL = spriteURL;
    }

    @Override
    public String toString()
    {
        return "Pokemon{" +
                "pokemonId=" + pokemonId +
                ", pokemonName='" + pokemonName + '\'' +
                ", spriteURL='" + spriteURL + '\'' +
                '}';
    }
}
