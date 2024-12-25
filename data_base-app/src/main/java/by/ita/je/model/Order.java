package by.ita.je.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;
@Builder
@Getter
@EqualsAndHashCode
@ToString
public class Order {
    private Long id;
    private List<? extends Vehicle> vehicles;
    private String destinationAddress;
    private ZonedDateTime destinationDate;
    private ZonedDateTime orderDate;
    private BigDecimal totalCost;
    private String supplier;
    private String buyer;

}
