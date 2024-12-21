package by.ita.je.dto;

import by.ita.je.model.Vehicle;

import java.math.BigDecimal;
import java.util.List;

public class OrderDTO {
    private Long id;
    private List<? extends Vehicle> vehicles;
    private String destinationAddress;
    private BigDecimal totalCost;
    private String supplier;
    private String buyer;

    public OrderDTO(Long id, List<? extends Vehicle> vehicles,
                    String destinationAddress,
                  BigDecimal totalCost, String supplier, String buyer) {
        this.id = id;
        this.vehicles = vehicles;
        this.destinationAddress = destinationAddress;
        this.totalCost = totalCost;
        this.supplier = supplier;
        this.buyer = buyer;
    }

    public Long getId() {
        return id;
    }

    public List<? extends Vehicle> getVehicles() {
        return vehicles;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public String getSupplier() {
        return supplier;
    }

    public String getBuyer() {
        return buyer;
    }

    public static class Builder {
        private Long id;
        private List<? extends Vehicle> vehicles;
        private String destinationAddress;
        private BigDecimal totalCost;
        private String supplier;
        private String buyer;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder vehicles(List<? extends Vehicle> vehicles) {
            this.vehicles = vehicles;
            return this;
        }

        public Builder destinationAddress(String destinationAddress) {
            this.destinationAddress = destinationAddress;
            return this;
        }

        public Builder totalCost(BigDecimal totalCost) {
            this.totalCost = totalCost;
            return this;
        }

        public Builder supplier(String supplier) {
            this.supplier = supplier;
            return this;
        }

        public Builder buyer(String buyer) {
            this.buyer = buyer;
            return this;
        }
        public OrderDTO build(){
            return new OrderDTO(this.id,
                    this.vehicles,
                    this.destinationAddress,
                    this.totalCost,
                    this.supplier,
                    this.buyer);
        }
    }
}
