package com.example.fitmecenter.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "SanPham")
@Data
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maSanPham;

    @Column(nullable = false, length = 100)
    private String tenSanPham;

    @Column(nullable = false)
    private BigDecimal gia;

    private int soLuongTon;

    private LocalDateTime ngayTao = LocalDateTime.now();
}