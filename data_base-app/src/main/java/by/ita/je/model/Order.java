package by.ita.je.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

public class Order {
    private Long id;
    private List<? extends Vehicle> vehicles;
    private String destinationAddress;
    private ZonedDateTime destinationDate;
    private ZonedDateTime orderDate;
    private BigDecimal totalCost;
    private String supplier;
    private String buyer;

    public Order(Long id, List<? extends Vehicle> vehicles,
                 String destinationAddress, ZonedDateTime destinationDate, ZonedDateTime orderDate, BigDecimal totalCost, String supplier, String buyer) {
        this.id = id;
        this.vehicles = vehicles;
        this.destinationAddress = destinationAddress;
        this.destinationDate = destinationDate;
        this.orderDate = orderDate;
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

    public ZonedDateTime getDestinationDate() {
        return destinationDate;
    }

    public ZonedDateTime getOrderDate() {
        return orderDate;
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
        private ZonedDateTime destinationDate;
        private ZonedDateTime orderDate;
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

        public Builder destinationDate(ZonedDateTime destinationDate) {
            this.destinationDate = destinationDate;
            return this;
        }

        public Builder orderDate(ZonedDateTime orderDate) {
            this.orderDate = orderDate;
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
        public Order build(){
            return new Order(this.id,
                    this.vehicles,
                    this.destinationAddress,
                    this.destinationDate,
                    this.orderDate,
                    this.totalCost,
                    this.supplier,
                    this.buyer);
        }
    }

}
