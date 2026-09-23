package com.ydh.workoffice.user.service;

import com.ydh.workoffice.user.dto.UserCreateRequest;
import com.ydh.workoffice.user.dto.UserResponse;
import com.ydh.workoffice.user.dto.UserUpdateRequest;
import com.ydh.workoffice.user.entity.User;
import com.ydh.workoffice.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;

    // 단건 조회
    public UserResponse getUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));

        return UserResponse.from(user);
    }

    // 목록 조회
    public List<UserResponse> getUsers() {
        return userRepository.findAll()
                .stream()
                .map(UserResponse::from)
                .toList();
    }

    // 등록
    @Transactional
    public UserResponse createUser(UserCreateRequest request) {
        User user = User.create(
                request.getName(),
                request.getEmail()
        );

        userRepository.save(user);

        return UserResponse.from(user);
    }

    // 수정
    @Transactional
    public UserResponse updateUser(Long id, UserUpdateRequest request) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));

        user.update(
                request.getName(),
                request.getEmail()
        );

        return UserResponse.from(user);
    }

    // 삭제
    @Transactional
    public void deleteUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));

        userRepository.delete(user);
    }
}