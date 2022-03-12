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
	TablePerClassRepository repo;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCredit(){
		CheckTable checkTable = new CheckTable();
		checkTable.setId(123);
		checkTable.setAmount(1300d);
		checkTable.setChecknumber("987654");
		repo.save(checkTable);
	}

	@Test
	public void testCard(){
		CardTable cardTable = new CardTable();
		cardTable.setId(123);
		cardTable.setAmount(1300d);
		cardTable.setCardnumber("787654");
		repo.save(cardTable);
	}
}
