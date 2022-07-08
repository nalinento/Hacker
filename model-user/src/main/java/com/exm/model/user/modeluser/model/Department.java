package com.exm.model.user.modeluser.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private long departmentId;
    private String departmentName;
    private String departmentLocation;
    private String departmentCode;
}
