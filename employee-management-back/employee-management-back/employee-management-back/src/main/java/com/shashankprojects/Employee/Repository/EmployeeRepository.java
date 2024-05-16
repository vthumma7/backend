package com.shashankprojects.Employee.Repository;

import com.shashankprojects.Employee.Entity.EmployeeEntity;
import com.shashankprojects.Employee.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
