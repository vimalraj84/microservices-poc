package com.bilqu.invt.service;

import com.bilqu.invt.eo.Inventory;
import com.bilqu.invt.dao.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.PathParam;
import java.util.Optional;

@RestController
public class InventoryController {

    @Autowired
    private Environment environment;

    @Autowired
    private InventoryRepository inventoryRepository;

    @GetMapping("/item/{sku}")
    public Optional<Inventory> findItem(@PathParam("sku") Integer sku){
        return inventoryRepository.findById(sku);
    }

    public int getStock(@PathParam("sku") Integer sku){
        return inventoryRepository.getStock(sku);
    }
}
