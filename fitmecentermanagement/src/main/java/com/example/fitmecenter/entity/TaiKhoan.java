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

    @Column(unique = true, nullable = false, length = 100)
    private String email;

    @Column(nullable = false)
    private String matKhau;

    @Column(nullable = false, length = 50)
    private String vaiTro;

    @Column(updatable = false)
    private LocalDateTime ngayTao = LocalDateTime.now();
}