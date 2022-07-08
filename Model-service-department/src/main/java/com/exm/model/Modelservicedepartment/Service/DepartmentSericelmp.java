package com.exm.model.Modelservicedepartment.Service;

import com.exm.model.Modelservicedepartment.model.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentSericelmp {

    public List<Department> getAllDepartmentData();

    public Department saveDepartment(Department department);

    public Department departmentFindById(long id);

    public void deleteDepartment(Department department);
}
