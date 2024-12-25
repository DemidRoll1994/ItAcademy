package by.ita.je.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class Truck extends Vehicle {
    private Long id;
    private double liftingCapacity;
    private String category;
    private String model;
    private BigDecimal price;
    private ZonedDateTime dateOfProduction;
    private double enginePower;
    private boolean isNew;

}
