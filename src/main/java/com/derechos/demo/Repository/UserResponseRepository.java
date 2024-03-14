package com.derechos.demo.Repository;

import com.derechos.demo.Model.UserResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserResponseRepository extends JpaRepository<UserResponse, Long> {


}