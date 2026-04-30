package com.example.fitmecenter.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "khachhang")
@Data
public class KhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maKhachHang;

    @OneToOne
    @JoinColumn(name = "ma_tai_khoan", nullable = false, unique = true)
    private TaiKhoan taiKhoan;

    @Column(nullable = false, length = 100)
    private String hoTen;

    @Column(nullable = false, length = 20)
    private String soDienThoai;

    @Column(nullable = false, length = 255)
    private String diaChi;

    @Column(nullable = false)
    private LocalDateTime ngayTao;
}