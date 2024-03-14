package com.derechos.demo.Service;

import com.derechos.demo.Model.Question;
import com.derechos.demo.Model.UserResponse;
import com.derechos.demo.Repository.UserResponseRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.derechos.demo.Model.QuestionChoices;



@AllArgsConstructor
@Data
@Service

public class UserResponseServiceImpl implements UserResponseService {

    private final UserResponseRepository userResponseRepository;

    @Override
    public UserResponse saveUserResponse(UserResponse userResponse) {
        return null;
    }

    @Override
    public List<UserResponse> getUserResponsesByUserId(Long userId) {


        return null;
    }

}