package com.example.demo;

import com.example.demo.SingleTableModel.Card;
import com.example.demo.SingleTableModel.CheckTable;
import com.example.demo.SingleTableRepository.SingleTableRepo;
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
	SingleTableRepo repo;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCheckCreate(){
		CheckTable cc = new CheckTable();
		cc.setId(129);
		cc.setAmount(1600d);
		cc.setChecknumber("907765");
		repo.save(cc);
	}

	@Test
	public void testCardCreate(){
		Card ch = new Card();
		ch.setId(128);
		ch.setAmount(1200d);
		ch.setCardnumber("808765");
		repo.save(ch);
	}

}
