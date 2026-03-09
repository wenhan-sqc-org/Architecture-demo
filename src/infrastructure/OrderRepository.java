package infrastructure;

import domain.Order;

public class OrderRepository {
    public Order findById(String id) {
        return new Order(id);
    }
}
