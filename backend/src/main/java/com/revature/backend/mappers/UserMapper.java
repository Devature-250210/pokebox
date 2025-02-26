package com.revature.backend.mappers;

import com.revature.backend.dto.UserDTO;
import com.revature.backend.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toUserDTO(User user);

    User toUser(UserDTO userDTO);
}
