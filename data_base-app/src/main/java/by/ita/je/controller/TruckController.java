package by.ita.je.controller;

import by.ita.je.dto.TruckDTO;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

@RestController

@RequestMapping("/truck")
public class TruckController {

    @PostMapping("/create")
    public TruckDTO create(){
        return TruckDTO.builder()
                .id(100L)
                .model("5440M9")
                .category("D")
                .isNew(true)
                .price(new BigDecimal(100_000))
                .liftingCapacity(12.7)
                .build();
    }
    @GetMapping("/read")
    public TruckDTO read(){
        return TruckDTO.builder()
                .id(100L)
                .model("5440M9")
                .category("DE")
                .isNew(true)
                .price(new BigDecimal(120_000))
                .liftingCapacity(19.5)
                .build();
    }
    @GetMapping("/read/all")
    public List<TruckDTO> readAll(){
        return Collections.emptyList();
    }
    @PutMapping("/update")
    public TruckDTO update(){
        return TruckDTO.builder()
                .id(100L)
                .model("5440M5")
                .category("C")
                .isNew(true)
                .price(new BigDecimal(80_000))
                .liftingCapacity(12.7)
                .build();
    }
    @DeleteMapping("/delete")
    public long delete(){
        TruckDTO truckDTO= TruckDTO.builder()
                .id(100L)
                .model("5440M5")
                .category("C")
                .isNew(true)
                .price(new BigDecimal(100_000))
                .liftingCapacity(12.7)
                .build();
        return truckDTO.getId();
    }
    @DeleteMapping("/delete/all")
    public List<TruckDTO> deleteAll(){
        return Collections.emptyList();
    }
}
