package com.educandoweb.workshop.controllers;

import com.educandoweb.workshop.entities.Order;
import com.educandoweb.workshop.entities.User;
import com.educandoweb.workshop.services.OrderService;
import com.educandoweb.workshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping()
    public ResponseEntity<List<Order>>findAll(){
        return ResponseEntity.ok().body(orderService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(orderService.findById(id));
    }
}