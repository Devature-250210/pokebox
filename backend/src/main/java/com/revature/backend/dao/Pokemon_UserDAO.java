package com.revature.backend.dao;

import com.revature.backend.entity.Pokemon_User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pokemon_UserDAO extends JpaRepository<Pokemon_User, Integer>
{

}
