package com.example.shoppingmalladminbe.repository;

import com.example.shoppingmalladminbe.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {
    ProductDetail findByProductIdx(Long productIdx);
}
