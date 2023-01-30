package com.simplilearn.demo;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.simplilearn.demo.entity.Order;
import com.simplilearn.demo.entity.OrderItem;
import com.simplilearn.demo.repo.OrderRepository;

@SpringBootTest
class OneToManyApplicationTests {

	@Autowired
	OrderRepository repo;
	@Test
	void orderTest() {
		Order order= new Order();
		OrderItem item1=new OrderItem();
		item1.setProduct("Scale");
		item1.setPrice(new BigDecimal(200));
		OrderItem item2=new OrderItem();
		item2.setProduct("Eraser");
		item2.setPrice(new BigDecimal(400));
		Set<OrderItem> set= new HashSet<>();
		set.add(item1);
		set.add(item2);
		
		order.setTotalQuantity(2);
		order.setStatus("pending");
		order.setOrderItems(set);
		
		repo.save(order);
	}

}
