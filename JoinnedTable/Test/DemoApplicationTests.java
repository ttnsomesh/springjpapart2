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
	JoinnedTableRepo repo;

	@Test
	void contextLoads() {
	}

	@Test
	void testCheck(){
		CheckTable ch = new CheckTable();
		ch.setId(123);
		ch.setAmount(1000d);
		ch.setChecknumber("567894");
		repo.save(ch);
	}

	@Test
	void testCard(){
		CardTable ch = new CardTable();
		ch.setId(125);
		ch.setAmount(1000d);
		ch.setCardnumber("667894");
		repo.save(ch);
	}

}
