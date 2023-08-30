package com.example.myjpatest.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.example.myjpatest.user.dto.UserDTO;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TUSER")
public class UserEntity {

    @Id
    @Column(name = "USERID", length = 12, nullable = false)
    private String userid;

    @Column(name = "PASSWD", length = 12, nullable = false)
    private String password;

    @Column(name = "USERNAME", length = 30, nullable = false)
    private String username;

    @Column(name = "EMAIL", length = 320)
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "INDATE")
    private java.util.Date indate;

    public static UserEntity toUserEntity(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setUserid(userDTO.getUserid());
        userEntity.setPassword(userDTO.getPasswd());
        userEntity.setUsername(userDTO.getUsername());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setIndate(userDTO.getIndate());
        return userEntity;
    }
}
