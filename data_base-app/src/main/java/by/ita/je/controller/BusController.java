package by.ita.je.controller;

import by.ita.je.dto.BusDTO;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

@RestController

@RequestMapping("/bus")
public class BusController {

    @PostMapping("/create")
    public BusDTO create(){
        return BusDTO.builder()
                .id(100L)
                .model("303T20")
                .category("Large")
                .isNew(true)
                .price(new BigDecimal(100_000))
                .seatsNumber((byte) 70)
                .build();
    }
    @GetMapping("/read")
    public BusDTO read(){
        return BusDTO.builder()
                .id(100L)
                .model("303T20")
                .category("Large")
                .isNew(true)
                .price(new BigDecimal(100_000))
                .seatsNumber((byte) 70)
                .build();
    }
    @GetMapping("/read/all")
    public List<BusDTO> readAll(){
        return Collections.emptyList();
    }
    @PutMapping("/update")
    public BusDTO update(){
        return BusDTO.builder()
                .id(100L)
                .model("303T22")
                .category("Large")
                .isNew(true)
                .price(new BigDecimal(110_000))
                .seatsNumber((byte) 74)
                .build();
    }
    @DeleteMapping("/delete")
    public long delete(){
        BusDTO busDTO= BusDTO.builder()
                .id(100L)
                .model("303T20")
                .category("Large")
                .isNew(true)
                .price(new BigDecimal(100_000))
                .seatsNumber((byte) 70)
                .build();
        return busDTO.getId();
    }
    @DeleteMapping("/delete/all")
    public List<BusDTO> deleteAll(){
        return Collections.emptyList();
    }
}
