package com.example.fitmecenter.repository;

import com.example.fitmecenter.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository
        extends JpaRepository<KhachHang, Integer> {

}