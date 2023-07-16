package ru.skypro.homework18.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.homework18.service.OrderService;

import java.util.List;

@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping ("add")
    public List<Integer> addItems(@RequestParam List<Integer> items){
        return orderService.addItems(items);
    }

    @GetMapping ("get")
    public List<Integer> getItems(){
        return orderService.getItems();
    }

}
