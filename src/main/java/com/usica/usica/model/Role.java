package com.usica.usica.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "roles")
public class Role {

    @Id
    private String id;
    private String name;
    private int noOfAssignedPeople;
    private UserAction createdBy;
    private UserAction updatedBy;
    private Long createdOn;
    private Long updatedOn;
    private Boolean active;
    private ArrayList<Permission> permission;
}
