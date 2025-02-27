package com.revature.backend.mappers;

import com.revature.backend.dto.OutgoingPokemonUserDTO;
import com.revature.backend.entity.Pokemon_User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PokemonUserMapper
{
    OutgoingPokemonUserDTO toOutgoingPokemonUserDTO(Pokemon_User pokemonUser);

    Pokemon_User toPokemon_User(OutgoingPokemonUserDTO outgoingPokemonUserDTO);
}
