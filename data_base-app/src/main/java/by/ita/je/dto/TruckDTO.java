package by.ita.je.dto;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class TruckDTO {

    private Long id;
    private double liftingCapacity;
    private String category;
    private String model;
    private BigDecimal price;
    private boolean isNew;

}
