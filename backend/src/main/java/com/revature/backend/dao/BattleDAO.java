package com.revature.backend.dao;

import com.revature.backend.entity.Battle;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BattleDAO extends JpaRepository<Battle, Integer>
{

}
