package com.kevinja.storefront.services.repositories;

import com.kevinja.storefront.services.objects.HealthCheckMessage;
import com.kevinja.storefront.services.objects.Severity;
import com.kevinja.storefront.services.objects.StoreItem;
import com.kevinja.storefront.services.objects.Storefront;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StorefrontRepository {
    public List<Storefront> getStorefronts() {
        List<Storefront> storefronts = new ArrayList<>();

        List<StoreItem> items = new ArrayList<>();
        items.add(new StoreItem(1, "guid1", "Large Coffee", new BigDecimal("3.89")));
        items.add(new StoreItem(2, "guid2", "Medium Coffee", new BigDecimal("3.29")));
        items.add(new StoreItem(3, "guid3", "Small Coffee", new BigDecimal("2.59")));
        storefronts.add(new Storefront(1, "guid", "Carrie's Coffee", items));

        return storefronts;
    }

    public List<HealthCheckMessage> getHealth() {
        List<HealthCheckMessage> messages = new ArrayList<>();
        messages.add(new HealthCheckMessage(Severity.INFO, "Mock storefront data service is up."));

        return messages;
    }
}
