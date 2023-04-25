package com.example.universityerdiagramexample.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "medicine")
@Data
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "medicine_id")
    private Company company;


@ManyToMany(cascade = CascadeType.PERSIST)
    List<Supplier> supplierList;
}
