package com.example.fitmecenter.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "DatLich")
@Data
public class DatLich {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maDatLich;

    @ManyToOne
    @JoinColumn(name = "maKhachHang", nullable = false)
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "maKhoaTap", nullable = false)
    private KhoaTap khoaTap;

    @ManyToOne
    @JoinColumn(name = "maNhanVien", nullable = false)
    private NhanVien nhanVien;

    @Column(nullable = false, length = 50)
    private String trangThai;

    @Column(nullable = false)
    private LocalDateTime thoiGianBatDau;

    @Column(nullable = false)
    private LocalDateTime thoiGianKetThuc;

    @Column(nullable = false)
    private LocalDateTime ngayDat;
}