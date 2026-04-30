package com.example.fitmecenter.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "magiamgia")
@Data
public class MaGiamGia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maGiamGia;

    @Column(nullable = false, unique = true, length = 50)
    private String maCode;

    @Column(nullable = false)
    private Integer giamPhanTram;

    @Column(nullable = false)
    private LocalDateTime hanSuDung;

    @Column(nullable = false)
    private Integer soLuong;

    @Column(nullable = false, length = 50)
    private String trangThai;
}