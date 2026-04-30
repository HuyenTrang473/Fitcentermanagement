package com.example.fitmecenter.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Entity
@Table(name = "donhang")
@Data
public class DonHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maDonHang;

    @ManyToOne
    @JoinColumn(name = "ma_khach_hang", nullable = false)
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "ma_giam_gia")
    private MaGiamGia maGiamGia;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal tongTien;

    @Column(nullable = false, length = 50)
    private String trangThai;

    @Column(nullable = false)
    private LocalDateTime ngayDat;
}