package com.example.fitmecenter.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name = "ChiTietDonHang")
@Data
public class ChiTietDonHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maChiTiet;

    @ManyToOne
    @JoinColumn(name = "maDonHang", nullable = false)
    private DonHang donHang;

    @ManyToOne
    @JoinColumn(name = "maSanPham", nullable = false)
    private SanPham sanPham;

    @Column(nullable = false)
    private Integer soLuong;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal gia;
}