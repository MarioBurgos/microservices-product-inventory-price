package com.example.inventoryservice.controller.impl;

import com.example.inventoryservice.controller.interfaces.InventoryController;
import com.example.inventoryservice.model.Inventory;
import com.example.inventoryservice.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class InventoryControllerImpl implements InventoryController {
    @Autowired
    private InventoryRepository inventoryRepository;
    @GetMapping("/inventory/{serialNumber}")
    public Inventory getBySerialNumber(@PathVariable Long serialNumber) {
        return inventoryRepository.findById(serialNumber).get();
    }
}
