package com.example.demo;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    //JPQL Repo

    @Query("from Employee")
    List<Employee> findAllEmployees();

    @Query("select emp.firstname,emp.lastname from Employee emp where emp.salary > (select AVG(salary) from Employee)")
    List<Object[]> findAllEmployeeAvg(Sort sort);

    @Modifying
    @Query("update Employee set salary =:salary where salary < :avgsalary")
    void updateSalaryOfEmployeeLessThanAvg(@Param("salary") double salary , @Param("avgsalary") double avgsalary);

    @Query("select avg(salary) from Employee")
    double findAverageSalary();

    @Query("select min(salary) from Employee")
    double findMinimumSalary();

    @Modifying
    @Query("delete from Employee where salary=:minSalary")
    void deleteAllEmployeeSalaryMin(@Param("minSalary") double salary);

    //Native JPQL Repo

   @Query(value = "select id , firstname , age from employee where lastname like '%singh'" , nativeQuery = true)
    List<Object[]> findAllEmployeeNameEndsWithSingh();

   @Modifying
   @Query(value = "delete from employee where age>:age" , nativeQuery = true)
    void deleteAllEmployeeAgeGreaterThan(@Param("age") int age);
}
