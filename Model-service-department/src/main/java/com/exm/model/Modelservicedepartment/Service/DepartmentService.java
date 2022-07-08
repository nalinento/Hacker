package com.exm.model.Modelservicedepartment.Service;

import com.exm.model.Modelservicedepartment.Repository.DepartmentRepository;
import com.exm.model.Modelservicedepartment.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.Yaml;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService implements DepartmentSericelmp{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public List<Department> getAllDepartmentData() {
        return departmentRepository.findAll();
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department departmentFindById(long id) {

        return  departmentRepository.departmentFindBy(id);
    }

    @Override
    public void deleteDepartment(Department department) {
        departmentRepository.delete(department);
    }


}
