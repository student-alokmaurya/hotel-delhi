package com.mauryaalok.HotelDelhi.service.interfac;

import com.mauryaalok.HotelDelhi.dto.Response;
import com.mauryaalok.HotelDelhi.entity.Booking;

public interface IBookingService {

Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

Response findBookingByConfirmationCode(String confirmationCode);

Response getAllBooking();

Response cancelBooking(Long bookingId);
}
