package org.example.backend1.mappers;


import org.example.backend1.dtos.SignUpDto;
import org.example.backend1.dtos.UserDto;
import org.example.backend1.entites.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}
