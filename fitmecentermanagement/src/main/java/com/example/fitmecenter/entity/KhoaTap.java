package com.example.fitmecenter.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "KhoaTap")
@Data
public class KhoaTap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maKhoaTap;

    @Column(nullable = false, length = 100)
    private String tenKhoaTap;

    @Column(nullable = false)
    private BigDecimal gia;

    private int thoiLuong;

    private LocalDateTime ngayTao = LocalDateTime.now();
}