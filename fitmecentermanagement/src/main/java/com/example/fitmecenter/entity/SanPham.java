package com.example.fitmecenter.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Entity
@Table(name = "sanpham")
@Data
public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maSanPham;

    @Column(nullable = false, length = 100)
    private String tenSanPham;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal gia;

    @Column(nullable = false)
    private Integer soLuongTon;

    @Column(nullable = false)
    private LocalDateTime ngayTao;
}