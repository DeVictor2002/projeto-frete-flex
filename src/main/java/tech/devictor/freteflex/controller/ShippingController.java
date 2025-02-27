package tech.devictor.freteflex.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ShippingController {

    @GetMapping(value = "/shipping/calculate")
    public ResponseEntity<?> calculate(@RequestParam("type") String shippingType,
                                       @RequestParam("distance") Double distance,
                                       @RequestParam("weight") Double weight) {
        return ResponseEntity.ok().build();
    }
}
