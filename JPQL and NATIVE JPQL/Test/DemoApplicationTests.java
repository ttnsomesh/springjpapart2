package com.example.demo;

import com.example.demo.PaymentModelJoinned.CreditcardJoinned;
import com.example.demo.PaymentModelSingleTable.Creditcard;
import com.example.demo.PaymentModelSingleTable.DebitCard;
import com.example.demo.inheritancemappingsingletable.PaymentJoinnedRepo;
import com.example.demo.inheritancemappingsingletable.PaymentSingletable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@SpringBootTest
class DemoApplicationTests {

	@Autowired
	EmployeeRepository repo;


	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate(){
		Employee e1 = new Employee();
		e1.setFirstname("rahul");
		e1.setLastname("rawat");
		e1.setAge(59);
		e1.setSalary(62000d);
		Employee e2 = new Employee();
		e2.setFirstname("abhishek");
		e2.setLastname("kumar");
		e2.setAge(52);
		e2.setSalary(68000d);
		repo.save(e1);
		repo.save(e2);
	}

	//JPQL TEST CASES
	@Test
	public void testFindByGreaterThanAvg(){
		Sort sort = Sort.by("age").ascending().and(Sort.by("salary").descending());
		List<Object[]> partialData = repo.findAllEmployeeAvg(sort);
		for(Object[] obj : partialData){
			System.out.println(obj[0]+" "+obj[1]);
		}
	}

	@Test
	@Transactional
	@Rollback(value = false)
	public void testUpdateSalaryOfEmployeeLessThanAvg(){
		double salary = 6800;
		double avgSalary = repo.findAverageSalary();
		repo.updateSalaryOfEmployeeLessThanAvg(salary , avgSalary);
	}

	@Test
	@Transactional
	@Rollback(value = false)
	public void testdeleteEmployeeWithMinSalary(){
		double minSalary = repo.findMinimumSalary();
		repo.deleteAllEmployeeSalaryMin(minSalary);
	}

	//Native JPQL Test Cases

	@Test
	public void testNameEndsWithSingh(){
		List<Object[]> empdata = repo.findAllEmployeeNameEndsWithSingh();
		for(Object[] obj : empdata){
			System.out.println(obj[0]+" "+obj[1]+" "+obj[2]);
		}
	}

	@Test
	@Transactional
	@Rollback(value = false)
	public void testdeleteAllEmployeeAgeGreaterThan(){
		repo.deleteAllEmployeeAgeGreaterThan(45);
	}



}
