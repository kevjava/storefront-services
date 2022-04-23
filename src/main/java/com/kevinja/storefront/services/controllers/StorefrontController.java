package com.kevinja.storefront.services.controllers;

import com.kevinja.storefront.services.objects.*;
import com.kevinja.storefront.services.repositories.StorefrontRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/storefront")
public class StorefrontController {

    private final StorefrontRepository repository;

    public StorefrontController(StorefrontRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/health")
    public HealthCheckResponse getHealth() {
        return new HealthCheckResponse()
                .addMessages(repository.getHealth())
                .addMessage(new HealthCheckMessage(Severity.INFO, "Service is up.")
        );
    }

    @GetMapping("/")
    public List<Storefront> getStorefronts() {
        return repository.getStorefronts();
    }
}
