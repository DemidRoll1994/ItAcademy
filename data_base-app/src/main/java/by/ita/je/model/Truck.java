package by.ita.je.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class Truck extends Vehicle {
    private Long id;
    private double liftingCapacity;
    private String category;
    private String model;
    private BigDecimal price;
    private ZonedDateTime dateOfProduction;
    private double enginePower;
    private boolean isNew;

    public Truck(Long id, double liftingCapacity, String category, String model, BigDecimal price, ZonedDateTime dateOfProduction, double enginePower, boolean isNew) {
        this.id = id;
        this.liftingCapacity = liftingCapacity;
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

    public double getLiftingCapacity() {
        return liftingCapacity;
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

    public class Builder {
        private Long id;
        private double liftingCapacity;
        private String category;
        private String model;
        private BigDecimal price;
        private ZonedDateTime dateOfProduction;
        private double enginePower;
        private boolean isNew;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder liftingCapacity(double liftingCapacity) {
            this.liftingCapacity = liftingCapacity;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
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
        public Truck build(){
            return new Truck(
                    this.id,
                    this.liftingCapacity,
                    this.category,
                    this.model,
                    this.price,
                    this.dateOfProduction,
                    this.enginePower,
                    this.isNew);
        }
    }

}
