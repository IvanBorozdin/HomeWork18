package ru.skypro.homework18.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework18.model.Cart;

import java.util.List;
@Service
public class OrderServiceimpl implements OrderService{
    private final Cart cart;

    public OrderServiceimpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> items) {
        return cart.add(items);
    }

    @Override
    public List<Integer> getItems() {
        return cart.get();
    }
}
