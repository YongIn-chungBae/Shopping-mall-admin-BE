package com.example.shoppingmalladminbe.repository;

import com.example.shoppingmalladminbe.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
    Notice findByIdx(Long noticeIdx);
}
