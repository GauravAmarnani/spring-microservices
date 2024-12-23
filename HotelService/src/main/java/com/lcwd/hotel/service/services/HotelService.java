package com.lcwd.hotel.service.services;

import com.lcwd.hotel.service.entities.Hotel;

import java.util.List;

public interface HotelService {

    //Hotel Operations

    //Create:
    Hotel create(Hotel hotel);

    //Get Hotel by hotelId:
    Hotel get(String hotelId);

    //Get All Hotels:
    List<Hotel> getAll();
}
