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
public class Dealer {

    private Long id;
    private boolean isOfficial;
    private ZonedDateTime licenseExpiration;
    private BigDecimal orderCostLimit;
    private String address;
    private String name;
    private int numberOfEmployees;
    private Long legalNumber;

}
