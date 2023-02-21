package com.example.edgeservice.client;

import com.example.edgeservice.dto.PriceDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient("price-service")
public interface PriceServiceClient {
    @GetMapping("/prices/{serialNumber}")
    public PriceDTO getBySerialNumber(@PathVariable Long serialNumber);
}
