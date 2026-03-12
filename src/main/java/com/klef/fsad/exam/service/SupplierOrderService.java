package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.SupplierOrder;
import com.klef.fsad.exam.repository.SupplierOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SupplierOrderService {

    @Autowired
    private SupplierOrderRepository repository;

    // Add a SupplierOrder
    public SupplierOrder addSupplierOrder(SupplierOrder order) {
        return repository.save(order);
    }

    // Get all SupplierOrders
    public List<SupplierOrder> getAllSupplierOrders() {
        return repository.findAll();
    }
}