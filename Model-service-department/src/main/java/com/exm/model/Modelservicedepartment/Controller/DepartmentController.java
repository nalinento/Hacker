package com.exm.model.Modelservicedepartment.Controller;

import com.exm.model.Modelservicedepartment.Service.DepartmentService;
import com.exm.model.Modelservicedepartment.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/saveDepartment")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/allDetail")
    public List<Department> getAllDepartmentDetails(){

        return departmentService.getAllDepartmentData();
    }
    @GetMapping("/{id}")
    public Department departmentFindById(@PathVariable("id") long id){
        return departmentService.departmentFindById(id);
    }
    @DeleteMapping("/delete")
    public String deleteDepartment(@RequestBody Department department){
        departmentService.deleteDepartment(department);
        return "Succefull";
    }
}
