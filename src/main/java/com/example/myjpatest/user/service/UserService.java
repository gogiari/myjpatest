package com.example.myjpatest.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myjpatest.user.dto.UserDTO;
import com.example.myjpatest.user.entity.UserEntity;
import com.example.myjpatest.user.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public List<UserDTO> findAll() {
        List<UserEntity> userEntityList = userRepo.findAll();
        List<UserDTO> userDTOList = new ArrayList();
        for (UserEntity userEntity : userEntityList) {
            userDTOList.add(UserDTO.toUserDTO(userEntity));
            // userDTO userDTO = UserDTO.toUserDTO(userEntity);
            // userDTOList.add(userDTO);
        }
        return userDTOList;
    }

}
