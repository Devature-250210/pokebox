package com.revature.backend.dto;

import com.revature.backend.entity.Pokemon;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.UUID;

@Getter
@Setter
@Builder
public class OutgoingPokemonUserDTO
{
    private int pokemonUserId;
    private UserDTO user;
    private Pokemon pokemon;
    private int amountCaught;
    private Date dateTime;
}
