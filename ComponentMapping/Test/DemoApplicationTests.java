package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureTestEntityManager
class DemoApplicationTests {

	@Autowired
	EmployeeMappingRepo repo;

	@Test
	void contextLoads() {
	}

	@Test
	public void testEmployee(){
		Employee e = new Employee();
		e.setId(11);
		e.setFirstname("somesh");
		e.setLastname("kumar");
		e.setAge(23);
		Salary s = new Salary();
		s.setBasicsalary(30000d);
		s.setBonussalary(10000d);
		s.setSpecialallowancesalary(5000d);
		s.setTaxamount(2000d);
		e.setSalary(s);
		repo.save(e);
	}

}
