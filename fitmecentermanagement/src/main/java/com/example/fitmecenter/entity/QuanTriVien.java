package com.example.fitmecenter.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "quantrivien")
@Data
public class QuanTriVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maQuanTriVien;

    @OneToOne
    @JoinColumn(name = "ma_tai_khoan", nullable = false, unique = true)
    private TaiKhoan taiKhoan;

    @Column(nullable = false, length = 100)
    private String hoTen;

    @Column(length = 20)
    private String soDienThoai;

    @Column(nullable = false)
    private LocalDateTime ngayTao;
}