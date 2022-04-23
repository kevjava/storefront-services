package com.kevinja.storefront.services.objects;

import java.math.BigDecimal;

public record StoreItem(int id, String guid, String name, BigDecimal price)
{}
