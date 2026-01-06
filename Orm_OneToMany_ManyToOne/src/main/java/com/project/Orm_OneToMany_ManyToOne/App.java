package com.project.Orm_OneToMany_ManyToOne;

import com.dao.DepartmentDao;
import com.dao.EmployeeDao;
import com.project.Orm_OneToMany_ManyToOne.entities.Department;
import com.project.Orm_OneToMany_ManyToOne.entities.Employee;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        DepartmentDao deptDao=new DepartmentDao();
        EmployeeDao empDao=new EmployeeDao();
        Department dept=new Department("Training");
        Employee e1=new Employee("Swapna");
        Employee e2=new Employee("sandhya");
        Employee e3=new Employee("nandu");
        
        dept.addEmployee(e1);dept.addEmployee(e2);dept.addEmployee(e3);
        //deptDao.addDepartment(dept);

        //deptDao.findAll();
        //deptDao.delete();
    }
}
