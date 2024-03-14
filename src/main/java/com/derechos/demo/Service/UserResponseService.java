package com.derechos.demo.Service;

import com.derechos.demo.Model.UserResponse;

import java.util.List;

public interface UserResponseService {
    UserResponse saveUserResponse(UserResponse userResponse);
    List<UserResponse> getUserResponsesByUserId(Long userId);
}