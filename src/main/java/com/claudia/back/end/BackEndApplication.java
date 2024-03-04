package com.claudia.back.end;

import com.claudia.entities.Order;
import com.claudia.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.claudia"})
class BackEndApplication implements CommandLineRunner {
	private OrderService orderService;

	public BackEndApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(BackEndApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order();
		System.out.println(orderService.total(order));

	}
}
