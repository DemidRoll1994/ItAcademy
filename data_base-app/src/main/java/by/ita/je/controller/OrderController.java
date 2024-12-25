package by.ita.je.controller;

import by.ita.je.dto.OrderDTO;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/create")
    public OrderDTO create() {
        return OrderDTO.builder()
                .id(100L)
                .buyer("KUP MinskTrans")
                .destinationAddress("Minsk, Gikalo,3")
                .supplier("MAZSpecAuto")
                .totalCost(new BigDecimal(50_000_000))
                .vehicles(Collections.emptyList())
                .build();
    }

    @GetMapping("/read")
    public OrderDTO read() {
        return OrderDTO.builder()
                .id(100L)
                .buyer("KUP MinskTrans")
                .destinationAddress("Minsk, Gikalo,3")
                .supplier("MAZSpecAuto")
                .totalCost(new BigDecimal(50_000_000))
                .vehicles(Collections.emptyList())
                .build();
    }

    @GetMapping("/read/all")
    public List<OrderDTO> readAll() {
        return Collections.emptyList();
    }

    @PutMapping("/update")
    public OrderDTO update() {
        return OrderDTO.builder()
                .id(100L)
                .buyer("KUP MinskTrans")
                .destinationAddress("Minsk, Gikalo,3")
                .supplier("MAZSpecAuto")
                .totalCost(new BigDecimal(50_000_000))
                .vehicles(Collections.emptyList())
                .build();
    }

    @DeleteMapping("/delete")
    public long delete() {
        OrderDTO orderDTO = OrderDTO.builder()
                .id(100L)
                .buyer("KUP MinskTrans")
                .destinationAddress("Minsk, Gikalo,3")
                .supplier("MAZSpecAuto")
                .totalCost(new BigDecimal(50_000_000))
                .vehicles(Collections.emptyList())
                .build();
        return orderDTO.getId();
    }

    @DeleteMapping("/delete/all")
    public List<OrderDTO> deleteAll() {
        return Collections.emptyList();
    }
}
