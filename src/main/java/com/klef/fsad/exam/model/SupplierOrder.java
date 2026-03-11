package com.klef.fsad.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "supplierorder")
public class SupplierOrder {

    @Id
    private String supplierOrderId;  // Manual ID input

    private String name;
    private Date date;
    private String status;
    private String description; // optional

    // Constructors
    public SupplierOrder() {}

    public SupplierOrder(String supplierOrderId, String name, Date date, String status, String description) {
        this.supplierOrderId = supplierOrderId;
        this.name = name;
        this.date = date;
        this.status = status;
        this.description = description;
    }

    // Getters and Setters
    public String getSupplierOrderId() { return supplierOrderId; }
    public void setSupplierOrderId(String supplierOrderId) { this.supplierOrderId = supplierOrderId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}