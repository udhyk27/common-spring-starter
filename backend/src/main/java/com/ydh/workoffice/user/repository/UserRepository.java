package com.ydh.workoffice.user.repository;

import com.ydh.workoffice.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// 기본 인터페이스만 생성하면 CRUD 사용 가능
public interface UserRepository extends JpaRepository<User, Long> {
}