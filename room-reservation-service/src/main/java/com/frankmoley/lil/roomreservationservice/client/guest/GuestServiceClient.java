package com.frankmoley.lil.roomreservationservice.client.guest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "guest-service", fallback = GuestServiceFallback.class)
public interface GuestServiceClient {
    @GetMapping("/guests")
    List<Guest> getAll();

    @PostMapping("/guests")
    Guest addGuest(@RequestBody Guest guest);

    @GetMapping("/guests/{id}")
    Guest getGuest(@PathVariable long id);

    @PutMapping("/guests/{id}")
    void updateGuest(@PathVariable long id, Guest guest);

    @DeleteMapping("/guests/{id}")
    void deleteGuest(@PathVariable long id);
}
