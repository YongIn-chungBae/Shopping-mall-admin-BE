package com.example.shoppingmalladminbe.repository;

import com.example.shoppingmalladminbe.entity.ShoppingCart;
import com.example.shoppingmalladminbe.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    List<ShoppingCart> findByUserIdx(User userIdx);
}
