package com.example.priceservice.controller.interfaces;

import com.example.priceservice.model.Price;

import java.util.Optional;

public interface PriceController {
    Price getBySerialNumber(Long serialNumber);
}
