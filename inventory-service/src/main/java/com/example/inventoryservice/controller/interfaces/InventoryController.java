package com.example.inventoryservice.controller.interfaces;

import com.example.inventoryservice.model.Inventory;

import java.util.Optional;

public interface InventoryController {
    Inventory getBySerialNumber(Long serialNumber);
}
