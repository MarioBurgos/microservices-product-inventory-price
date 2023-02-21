package com.example.priceservice.controller.impl;

import com.example.priceservice.controller.interfaces.PriceController;
import com.example.priceservice.model.Price;
import com.example.priceservice.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
@RestController
public class PriceControllerImpl implements PriceController {
    @Autowired
    private PriceRepository priceRepository;

    @GetMapping("/prices/{serialNumber}")
    public Price getBySerialNumber(@PathVariable Long serialNumber) {
        return priceRepository.findById(serialNumber).get();
    }
}
