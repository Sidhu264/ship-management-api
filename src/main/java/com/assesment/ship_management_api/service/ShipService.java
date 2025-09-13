package com.assesment.ship_management_api.service;

import com.assesment.ship_management_api.model.Ship;
import com.assesment.ship_management_api.repository.ShipRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShipService {

    private final ShipRepository shipRepository;

    public List<Ship> getAllShips(){
        return shipRepository.findAll();
    }

    public Ship getShipById(Long id){
        return shipRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Ship not found with id: "+id));
    }

    public Ship createShip(Ship ship){
        return shipRepository.save(ship);
    }

    public Ship updateShip(Long id, Ship updatedShip){
        Ship existingShip = getShipById(id);
        existingShip.setName(updatedShip.getName());
        existingShip.setEmail(updatedShip.getEmail());
        return shipRepository.save(existingShip);
    }

    public void deleteShip(Long id){
        Ship ship = getShipById(id);
        shipRepository.delete(ship);
    }
}
