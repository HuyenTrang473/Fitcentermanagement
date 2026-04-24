package com.example.fitmecenter.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "MaGiamGia")
@Data
public class MaGiamGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maMaGiamGia;

    @Column(unique = true, nullable = false, length = 20)
    private String maCode;

    private int giamPhanTram;
    private LocalDateTime hanSuDung;
    private int soLuong;

    @Column(length = 20)
    private String trangThai = "CON_HAN";
}