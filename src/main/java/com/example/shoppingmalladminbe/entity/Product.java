package com.example.shoppingmalladminbe.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "product_idx") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_count")
    private int count;

    @Column(name = "product_price")
    private int price;

    @Column(name = "product_image")
    private String image;

    @Column(name = "product_category")
    private String category;

    @Column(name = "product_bp_category")
    private String bpCategory;


}
