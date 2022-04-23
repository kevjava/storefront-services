package com.kevinja.storefront.services.objects;

import java.util.List;

/**
 * A Storefront object representing a store run by a seller that sells items.
 */
public record Storefront (
    int id,
    String guid,
    String name,
    List<StoreItem> storeItems
) {}
