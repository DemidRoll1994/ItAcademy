package by.ita.je.dto;

import by.ita.je.model.Vehicle;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;
@Builder
@Getter
@EqualsAndHashCode
@ToString
public class OrderDTO {
    private Long id;
    private List<? extends Vehicle> vehicles;
    private String destinationAddress;
    private BigDecimal totalCost;
    private String supplier;
    private String buyer;

}
