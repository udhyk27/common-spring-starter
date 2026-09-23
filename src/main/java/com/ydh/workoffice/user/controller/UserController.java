package com.ydh.workoffice.user.controller;

import com.ydh.workoffice.common.response.ApiResponse;
import com.ydh.workoffice.user.dto.UserResponse;
import com.ydh.workoffice.user.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

//    특정 리소스 식별	@PathVariable	/users/10
//    검색 조건	@RequestParam	/users?name=홍길동
//    필터	@RequestParam	/users?status=ACTIVE
//    페이지네이션	@RequestParam	/users?page=0&size=20
//    생성 데이터	@RequestBody	POST /users + JSON
//    수정 데이터	@RequestBody	PUT /users/10 + JSON

    private final UserService userService;

    // 1. 사용자 단건 조회
    @GetMapping("/{id}")
    public ApiResponse<UserResponse> getUser(@PathVariable Long id) {
        return ApiResponse.success(userService.getUser(id));
    }

    // 2. 사용자 목록 조회
    @GetMapping
    public ApiResponse<List<UserResponse>> getUsers() {
        return ApiResponse.success(userService.getUsers());
    }

    // 3. 사용자 등록
    @PostMapping
    public ApiResponse<UserResponse> createUser(@RequestBody UserCreateRequest request) {
        return ApiResponse.success(userService.createUser(request));
    }

    // 4. 사용자 수정
    @PutMapping("/{id}")
    public ApiResponse<UserResponse> updateUser(@PathVariable Long id,
                                                @RequestBody UserUpdateRequest request) {
        return ApiResponse.success(userService.updateUser(id, request));
    }

    // 5. 사용자 삭제
    @DeleteMapping("/{id}")
    public ApiResponse<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ApiResponse.success(null);
    }
}