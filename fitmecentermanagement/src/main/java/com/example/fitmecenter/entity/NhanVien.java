package com.example.fitmecenter.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "NhanVien")
@Data
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maNhanVien;

    @OneToOne
    @JoinColumn(name = "maTaiKhoan", unique = true, nullable = false)
    private TaiKhoan taiKhoan;

    @Column(nullable = false, length = 100)
    private String hoTen;

    @Column(nullable = false, length = 50)
    private String chucVu;

    @Column(nullable = false, length = 15)
    private String soDienThoai;

    private LocalDateTime ngayTao = LocalDateTime.now();
}