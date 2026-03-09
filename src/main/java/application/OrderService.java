package application;

import domain.Order;
import infrastructure.OrderRepository;

public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public Order getOrder(String id) {
        return repository.findById(id);
    }
}
