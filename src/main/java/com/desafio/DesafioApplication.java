package com.desafio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio.entities.Order;
import com.desafio.services.OrderService;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner{
	
	@Autowired
	public OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Order order = new Order(2282, 95.90, 0.0);
		
		System.out.println("ENTRADA");
		System.out.println("  Código: " + order.getCode());
		System.out.println("  Valor: " + String.format("%.2f", order.getBasic()));
		System.out.println("  Desconto(%): " + String.format("%.2f", order.getDiscount()));
		System.out.println("SAÍDA"); 
		System.out.println("  Pedido Código: " + order.getCode()); 
		System.out.println("  Valor total: R$ " + String.format("%.2f", orderService.total(order)));
		
		
	}
}
