package com.bilqu.invt.dao;

import com.bilqu.invt.bo.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,Integer> {
    Inventory searchBySku(Integer sku);
    Inventory searchByUpc(String upc);
    int getStock(Integer sku);
}
