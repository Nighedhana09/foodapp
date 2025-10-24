package com.foodapp.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@SpringBootApplication
@RestController
@RequestMapping("/restaurant")
public class RestaurantServiceApplication {

    private static final List<String> MENU = Arrays.asList("Pizza", "Burger", "Pasta", "Salad");

    @GetMapping("/menu")
    public List<String> getMenu() {
        return MENU;
    }

    public static void main(String[] args) {
        SpringApplication.run(RestaurantServiceApplication.class, args);
    }
}
