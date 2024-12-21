package by.ita.je.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class Dealer {

    private Long id;
    private boolean isOfficial;
    private ZonedDateTime licenseExpiration;
    private BigDecimal orderCostLimit;
    private String address;
    private String name;
    private int numberOfEmployees;
    private Long legalNumber;

    public Dealer(Long id, boolean isOfficial, ZonedDateTime licenseExpiration, BigDecimal orderCostLimit, String address, String name, int numberOfEmployees, Long legalNumber) {
        this.id = id;
        this.isOfficial = isOfficial;
        this.licenseExpiration = licenseExpiration;
        this.orderCostLimit = orderCostLimit;
        this.address = address;
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
        this.legalNumber = legalNumber;
    }

    public Long getId() {
        return id;
    }

    public boolean isOfficial() {
        return isOfficial;
    }

    public ZonedDateTime getLicenseExpiration() {
        return licenseExpiration;
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

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public Long getLegalNumber() {
        return legalNumber;
    }

    public static class Builder {
        private Long id;
        private boolean isOfficial;
        private ZonedDateTime licenseExpiration;
        private BigDecimal orderCostLimit;
        private String address;
        private String name;
        private int numberOfEmployees;
        private Long legalNumber;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder official(boolean official) {
            isOfficial = official;
            return this;
        }

        public Builder licenseExpiration(ZonedDateTime licenseExpiration) {
            this.licenseExpiration = licenseExpiration;
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

        public Builder numberOfEmployees(int numberOfEmployees) {
            this.numberOfEmployees = numberOfEmployees;
            return this;
        }

        public Builder legalNumber(Long legalNumber) {
            this.legalNumber = legalNumber;
            return this;
        }

        public Dealer build() {
            return new Dealer(this.id,
                    this.isOfficial,
                    this.licenseExpiration,
                    this.orderCostLimit,
                    this.address,
                    this.name,
                    this.numberOfEmployees,
                    this.legalNumber);
        }
    }

}
