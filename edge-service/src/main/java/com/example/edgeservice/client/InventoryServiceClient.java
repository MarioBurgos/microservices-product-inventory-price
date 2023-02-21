package com.example.edgeservice.client;

import com.example.edgeservice.dto.InventoryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient("inventory-service")
public interface InventoryServiceClient {

    @GetMapping("/inventory/{serialNumber}")
    InventoryDTO getBySerialNumber(@PathVariable Long serialNumber);
}
