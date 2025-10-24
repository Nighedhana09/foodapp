package com.foodapp.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@SpringBootApplication
@RestController
@RequestMapping("/order")
public class OrderServiceApplication {

    private final Map<Integer, String> orders = new HashMap<>();
    private int counter = 1;

    @PostMapping("/create")
    public String createOrder(@RequestParam String item) {
        orders.put(counter, item);
        return "Order ID " + counter++ + " for " + item + " created successfully!";
    }

    @GetMapping("/all")
    public Map<Integer, String> getAllOrders() {
        return orders;
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
