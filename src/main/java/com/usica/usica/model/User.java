package com.usica.usica.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private String id;
    private String tagId;
    private String profileImage;
    private String fName;
    private String lName;
    private String gender;
    private String email;
    private Long mobileNo;
    private ObjectId department;
    private String designation;
    private ObjectId reportingManager;
    private Long dateOfJoining;
    private int totalExperience;
    private ObjectId permission;
    private String password;
    private int loginAttempts;
    private UserAction createdBy;
    private UserAction updatedBy;
    private Long createdAt;
    private Long updatedAt;
}
