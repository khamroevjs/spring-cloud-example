package com.frankmoley.lil.roomreservationservice.client.room;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("room-service")
public interface RoomServiceClient {

    @GetMapping("/rooms")
    List<Room> getAll();

    @PostMapping("/rooms")
    Room addRoom(Room room);

    @GetMapping("/rooms/{id}")
    Room getRoom(@PathVariable long id);

    @PutMapping("/rooms/{id}")
    void updateRoom(@PathVariable long id, Room room);

    @DeleteMapping("/rooms/{id}")
    void deleteRoom(@PathVariable long id);
}
