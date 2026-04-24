package com.example.fitmecenter.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "DonHang")
@Data
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maDonHang;

    @ManyToOne
    @JoinColumn(name = "maKhachHang", nullable = false)
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "maMaGiamGia")
    private MaGiamGia maGiamGia;

    private BigDecimal tongTien;

    @Column(length = 20)
    private String trangThai = "CHO_XU_LY";

    private LocalDateTime ngayDat = LocalDateTime.now();
}