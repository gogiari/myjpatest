package com.example.myjpatest.user.dto;

import java.util.Date;

import com.example.myjpatest.user.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDTO {
    private String userid;
    private String passwd;
    private String username;
    private String email;
    private Date indate;

    public static UserDTO toUserDTO(UserEntity userEntity){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserid(userEntity.getUserid());
        userDTO.setPasswd(userEntity.getPassword());
        userDTO.setUsername(userEntity.getUsername());
        userDTO.setEmail(userEntity.getEmail());
        userDTO.setIndate(userEntity.getIndate());
        return userDTO;
    }
}
