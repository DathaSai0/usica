package com.usica.usica.controller;


import com.usica.usica.Dto.ApiResponse;
import com.usica.usica.model.Role;
import com.usica.usica.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/create")
    public ResponseEntity<ApiResponse<Role>> createRole(@RequestBody Role role){
        Role respRole = roleService.createRole(role);
        ApiResponse<Role> response = new ApiResponse<>("Role has been created successfully" , 109 , respRole);
        return ResponseEntity.ok().body(response);
    }
}
