package by.ita.je.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class Bus extends Vehicle {

    private Long id;
    private byte seatsNumber;
    private String category;
    private String model;
    private BigDecimal price;
    private ZonedDateTime dateOfProduction;
    private double enginePower;
    private boolean isNew;

    public Bus(Long id, byte seatsNumber, String category, String model, BigDecimal price, ZonedDateTime dateOfProduction, double enginePower, boolean isNew) {
        this.id = id;
        this.seatsNumber = seatsNumber;
        this.category = category;
        this.model = model;
        this.price = price;
        this.dateOfProduction = dateOfProduction;
        this.enginePower = enginePower;
        this.isNew = isNew;
    }
    public Long getId() {
        return id;
    }

    public byte getSeatsNumber() {
        return seatsNumber;
    }

    public String getCategory() {
        return category;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ZonedDateTime getDateOfProduction() {
        return dateOfProduction;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public boolean isNew() {
        return isNew;
    }
    public static class Builder{
        private Long id;
        private byte seatsNumber;
        private String category;
        private String model;
        private BigDecimal price;
        private ZonedDateTime dateOfProduction;
        private double enginePower;
        private boolean isNew;

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder seatsNumber(byte seatsNumber) {
            this.seatsNumber = seatsNumber;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder dateOfProduction(ZonedDateTime dateOfProduction) {
            this.dateOfProduction = dateOfProduction;
            return this;
        }

        public Builder enginePower(double enginePower) {
            this.enginePower = enginePower;
            return this;
        }

        public Builder aNew(boolean aNew) {
            isNew = aNew;
            return this;
        }
        public Bus build(){
            return new Bus(this.id,
                    this.seatsNumber,
                    this.category,
                    this.model,
                    this.price,
                    this.dateOfProduction,
                    this.enginePower,
                    this.isNew);
        }
    }
}
