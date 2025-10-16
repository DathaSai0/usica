package com.usica.usica.service;


import com.usica.usica.Exceptions.ResponseException;
import com.usica.usica.Utils.Utility;
import com.usica.usica.model.Role;
import com.usica.usica.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepo roleRepo;

    public Role createRole(Role role){

        if(role == null || role.getName() == null || role.getName().isEmpty()){
           throw new ResponseException("Name field is mandatory" , 105);
        }


//        String currentUserId = Utility.getLoggedUserId();

        return roleRepo.save(role);
    }

}
