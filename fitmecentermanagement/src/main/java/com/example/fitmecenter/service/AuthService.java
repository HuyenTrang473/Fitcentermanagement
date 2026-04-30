package com.example.fitmecenter.service;

import com.example.fitmecenter.dto.LoginResponse;
import com.example.fitmecenter.entity.TaiKhoan;
import com.example.fitmecenter.repository.TaiKhoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    public LoginResponse login(String email, String matKhau) {

        Optional<TaiKhoan> tkOpt =
                taiKhoanRepository.findByEmail(email);

        if (tkOpt.isEmpty()) {

            return new LoginResponse(
                    "Email không tồn tại",
                    false
            );
        }

        TaiKhoan tk = tkOpt.get();

        if (!tk.getMatKhau().equals(matKhau)) {

            return new LoginResponse(
                    "Sai mật khẩu",
                    false
            );
        }

        return new LoginResponse(
                "Đăng nhập thành công",
                true
        );
    }
}