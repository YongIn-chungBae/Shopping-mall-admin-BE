package com.example.shoppingmalladminbe.repository;

import com.example.shoppingmalladminbe.entity.ProductEvaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductEvaluationRepository extends JpaRepository<ProductEvaluation, Long> {
}
