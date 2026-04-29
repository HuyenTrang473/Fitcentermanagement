package com.example.fitmecenter.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "TaiKhoan")
@Data
public class TaiKhoan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maTaiKhoan;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false, length = 255)
    private String matKhau;

    @ManyToOne
    @JoinColumn(name = "maVaiTro", nullable = false)
    private VaiTro vaiTro;

    @Column(nullable = false)
    private LocalDateTime ngayTao;
}