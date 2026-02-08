package com.mauryaalok.HotelDelhi.service.interfac;

import com.mauryaalok.HotelDelhi.dto.LoginRequest;
import com.mauryaalok.HotelDelhi.dto.Response;
import com.mauryaalok.HotelDelhi.entity.User;

public interface IUserService {

    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response  getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}
