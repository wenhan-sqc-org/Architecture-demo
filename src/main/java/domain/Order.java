package domain;

import infrastructure.OrderRepository;

public class Order {
    private final String id;

    public Order(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // Intentional architecture violation for SonarQube demo:
    // domain layer should not depend on infrastructure layer.
    public static Order loadForDemo(String id, OrderRepository repository) {
        return repository.findById(id);
    }
}
