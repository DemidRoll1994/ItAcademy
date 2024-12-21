package by.ita.je.dto;

import java.math.BigDecimal;

public class DealerDTO {

    private Long id;
    private boolean isOfficial;
    private BigDecimal orderCostLimit;
    private String address;
    private String name;
    private Long legalNumber;

    public DealerDTO(Long id, boolean isOfficial, BigDecimal orderCostLimit,
                     String address, String name, Long legalNumber) {
        this.id = id;
        this.isOfficial = isOfficial;
        this.orderCostLimit = orderCostLimit;
        this.address = address;
        this.name = name;
        this.legalNumber = legalNumber;
    }

    public Long getId() {
        return id;
    }

    public boolean isOfficial() {
        return isOfficial;
    }

    public BigDecimal getOrderCostLimit() {
        return orderCostLimit;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public Long getLegalNumber() {
        return legalNumber;
    }

    public static class Builder {
        private Long id;
        private boolean isOfficial;
        private BigDecimal orderCostLimit;
        private String address;
        private String name;
        private Long legalNumber;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder official(boolean official) {
            isOfficial = official;
            return this;
        }

        public Builder orderCostLimit(BigDecimal orderCostLimit) {
            this.orderCostLimit = orderCostLimit;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder legalNumber(Long legalNumber) {
            this.legalNumber = legalNumber;
            return this;
        }

        public DealerDTO build() {
            return new DealerDTO(this.id,
                    this.isOfficial,
                    this.orderCostLimit,
                    this.address,
                    this.name,
                    this.legalNumber);
        }
    }
}
