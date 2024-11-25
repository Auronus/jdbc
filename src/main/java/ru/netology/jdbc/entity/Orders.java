package ru.netology.jdbc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
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
}
