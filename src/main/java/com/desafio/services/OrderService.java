package com.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;

	public double total(Order order) {

		var valorFrete = shippingService.shipment(order);
		return order.getBasic() - (order.getBasic() * (order.getDiscount() / 100)) + valorFrete;
	}
}