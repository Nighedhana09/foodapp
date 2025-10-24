package com.foodapp.delivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/delivery")
public class DeliveryServiceApplication {

    @GetMapping("/status/{orderId}")
    public String getDeliveryStatus(@PathVariable int orderId) {
        return "Order " + orderId + " is on the way!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DeliveryServiceApplication.class, args);
    }
}
