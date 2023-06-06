package com.klyucherov.spring.controller;

import com.klyucherov.spring.model.Item;
import com.klyucherov.spring.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void add(@RequestParam Set<Integer> ids) {
        storeService.add(ids);
    }

    public List<Item> get() {
        return storeService.get();
    }

}
