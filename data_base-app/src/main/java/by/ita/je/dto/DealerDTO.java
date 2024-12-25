package by.ita.je.dto;

import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class DealerDTO {

    private Long id;
    private boolean isOfficial;
    private BigDecimal orderCostLimit;
    private String address;
    private String name;
    private Long legalNumber;

}
