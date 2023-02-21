package com.example.edgeservice.controller.impl;

import com.example.edgeservice.client.InventoryServiceClient;
import com.example.edgeservice.client.PriceServiceClient;
import com.example.edgeservice.controller.interfaces.EdgeController;
import com.example.edgeservice.dto.InventoryDTO;
import com.example.edgeservice.dto.PriceDTO;
import com.example.edgeservice.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EdgeControllerImpl implements EdgeController {
    @Autowired
    private InventoryServiceClient inventoryServiceClient;
    @Autowired
    private PriceServiceClient priceServiceClient;

    @GetMapping("/products/{serialNumber}")
    public ProductDTO getProductBySerialNumber(@PathVariable Long serialNumber){
        InventoryDTO inventoryDTO = inventoryServiceClient.getBySerialNumber(serialNumber);
        PriceDTO priceDTO = priceServiceClient.getBySerialNumber(serialNumber);
        return new ProductDTO(inventoryDTO.getSerialNumber(), priceDTO.getName(), priceDTO.getPrice(), inventoryDTO.getQuantity());
    }
}
