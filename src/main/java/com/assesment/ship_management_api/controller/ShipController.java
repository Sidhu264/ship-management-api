package com.assesment.ship_management_api.controller;

import com.assesment.ship_management_api.model.Ship;
import com.assesment.ship_management_api.service.ShipService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ships")
public class ShipController {

    private final ShipService shipService;

    @GetMapping("/{id}")
    public ResponseEntity<Ship> getShipById(@PathVariable Long id){
        return ResponseEntity.ok(shipService.getShipById(id));
    }

    @GetMapping
    public ResponseEntity<List<Ship>> getAllShips(){
        return ResponseEntity.ok(shipService.getAllShips());
    }

    @PostMapping
    public ResponseEntity<Ship> createShip(@Valid @RequestBody Ship ship) {
        Ship createdShip = shipService.createShip(ship);
        URI location = URI.create("/ships/" + createdShip.getId());
        return ResponseEntity
                .created(location)
                .body(createdShip);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Ship> updateShip(@PathVariable Long id, @Valid @RequestBody Ship ship){
        return ResponseEntity.ok(shipService.updateShip(id, ship));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteShip(@PathVariable Long id){
        shipService.deleteShip(id);
        return ResponseEntity.ok().build();
    }
}
