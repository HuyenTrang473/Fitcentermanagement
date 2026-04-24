package com.example.fitmecenter.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "Khachhang")
@Data
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maKhachHang;

    @OneToOne
    @JoinColumn(name = "maTaiKhoan", unique = true, nullable = false)
    private TaiKhoan taiKhoan;

    @Column(nullable = false, length = 100)
    private String hoTen;

    @Column(nullable = false, length = 15)
    private String soDienThoai;

    private String diaChi;

    private LocalDateTime ngayTao = LocalDateTime.now();
}