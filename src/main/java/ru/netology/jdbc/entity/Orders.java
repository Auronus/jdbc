package ru.netology.jdbc.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private LocalDate date;
    @ManyToOne(optional = false)
    private Customers customers;
    @Column(name = "product_name", nullable = false)
    private String productName;
    @Column(nullable = false)
    private int amount;

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public Customers getCustomers() {
        return customers;
    }

    public String getProductName() {
        return productName;
    }

    public int getAmount() {
        return amount;
    }
}
