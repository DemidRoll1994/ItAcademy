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
public class BusDTO {

    private Long id;
    private byte seatsNumber;
    private String category;
    private String model;
    private BigDecimal price;
    private boolean isNew;

}
