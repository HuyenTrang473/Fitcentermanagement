package com.example.fitmecenter.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Entity
@Table(name = "KhoaTap")
@Data
public class KhoaTap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maKhoaTap;

    @Column(nullable = false, length = 100)
    private String tenKhoaTap;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal gia;

    @Column(nullable = false)
    private Integer thoiLuong;

    @Column(nullable = false)
    private LocalDateTime ngayTao;
}