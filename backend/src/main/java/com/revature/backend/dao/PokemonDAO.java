package com.revature.backend.dao;

import com.revature.backend.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonDAO extends JpaRepository<Pokemon, Integer>
{

}
