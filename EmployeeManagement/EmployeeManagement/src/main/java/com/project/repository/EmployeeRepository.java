package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.Entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Employee findByEname(String name);

	List<Employee> findBySalary(double salary);
	
	
	@Query(value="select * from employee where salary=?1 and ename like ?2", nativeQuery= true)
	List<Employee> findBySalaryAndNameStartsWithS(@Param("salary")double salary,String name);
	
	@Query("select e from employee where e.salary=:salary and e.name=:name")
	List<Employee> findBySalaryAndNameStartsWithSUsingJPQL(@Param("salary")double salary,@Param ("name")String name);
	
	@Query(name="findByEmployeeName")
	Employee findByEmployeeName(@Param("name")String name);
	
}
