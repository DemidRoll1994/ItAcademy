package by.ita.je.controller;

import by.ita.je.dto.DealerDTO;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/dealer")
public class DealerController {


    @PostMapping("/create")
    public DealerDTO create() {
        return DealerDTO.builder()
                .id(100L)
                .address("Minsk, Rabochaya,7")
                .legalNumber(4938302845902L)
                .orderCostLimit(new BigDecimal(10_000_000))
                .isOfficial(true)
                .name("MAZSPECAUTO")
                .build();
    }

    @GetMapping("/read")
    public DealerDTO read() {
        return DealerDTO.builder()
                .id(100L)
                .address("Minsk, Rabochaya,7")
                .legalNumber(4938302845902L)
                .orderCostLimit(new BigDecimal(10_000_000))
                .isOfficial(true)
                .name("MAZSPECAUTO")
                .build();
    }

    @GetMapping("/read/all")
    public List<DealerDTO> readAll() {
        return Collections.emptyList();
    }

    @PutMapping("/update")
    public DealerDTO update() {
        return DealerDTO.builder()
                .id(101L)
                .address("Minsk, Rabochaya,7")
                .legalNumber(4938302841234L)
                .orderCostLimit(new BigDecimal(1_000_000))
                .isOfficial(false)
                .name("MAZSPECAUTO")
                .build();
    }

    @DeleteMapping("/delete")
    public long delete() {
        DealerDTO dealerDTO = DealerDTO.builder()
                .id(100L)
                .address("Minsk, Rabochaya,7")
                .legalNumber(4938302845902L)
                .orderCostLimit(new BigDecimal(10_000_000))
                .isOfficial(true)
                .name("MAZSPECAUTO")
                .build();
        return dealerDTO.getId();
    }

    @DeleteMapping("/delete/all")
    public List<DealerDTO> deleteAll() {
        return Collections.emptyList();
    }
}
