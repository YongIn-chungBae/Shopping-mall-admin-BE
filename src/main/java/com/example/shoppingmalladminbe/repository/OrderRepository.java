package com.example.shoppingmalladminbe.repository;

import com.example.shoppingmalladminbe.entity.Order;
import com.example.shoppingmalladminbe.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserIdx(User userIdx);
}
