package com.usica.usica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Permission {
    private String label;
    private Boolean enable;
    private Boolean isParent;
    private ArrayList<PermissionButtons> buttons;
}
