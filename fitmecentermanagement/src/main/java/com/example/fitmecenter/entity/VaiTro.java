package com.example.fitmecenter.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "vaitro")
@Data
public class VaiTro {

    @Id
    private Integer maVaiTro;

    @Column(nullable = false, length = 50)
    private String tenVaiTro;
}