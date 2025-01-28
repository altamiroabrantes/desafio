package com.desafio.services;

import java.util.Objects;
import org.springframework.stereotype.Service;
import com.desafio.entities.Order;

@Service
public class ShippingService {

	private double FRETE_20 = 20.00;
	private double FRETE_12 = 12.00;
	private double FRETE_ZERO = 0;

	public double shipment(Order order) {

		if (Objects.nonNull(order)) {
			if (order.getBasic() < 100.0) {
				return FRETE_20;
			} else if (order.getBasic() >= 100.00 && order.getBasic() < 200.00) {
				return FRETE_12;
			} else if (order.getBasic() >= 200.00) {
				return FRETE_ZERO;
			}
		}
		return FRETE_ZERO;
	}
}
