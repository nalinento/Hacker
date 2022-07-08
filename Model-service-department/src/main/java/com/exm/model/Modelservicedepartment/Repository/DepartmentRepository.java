package com.exm.model.Modelservicedepartment.Repository;

import com.exm.model.Modelservicedepartment.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    @Query("select d from Department d where d.departmentId =?1")
    Department departmentFindBy(long id);
}
