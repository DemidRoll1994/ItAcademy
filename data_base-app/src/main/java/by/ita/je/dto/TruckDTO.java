package by.ita.je.dto;

import java.math.BigDecimal;

public class TruckDTO {

    private Long id;
    private double liftingCapacity;
    private String category;
    private String model;
    private BigDecimal price;
    private boolean isNew;

    public TruckDTO(Long id, double liftingCapacity, String category,
                  String model, BigDecimal price, boolean isNew) {
        this.id = id;
        this.liftingCapacity = liftingCapacity;
        this.category = category;
        this.model = model;
        this.price = price;
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

    public boolean isNew() {
        return isNew;
    }

    public static class Builder {
        private Long id;
        private double liftingCapacity;
        private String category;
        private String model;
        private BigDecimal price;
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

        public Builder isNew(boolean isNew) {
            this.isNew = isNew;
            return this;
        }
        public TruckDTO build(){
            return new TruckDTO(
                    this.id,
                    this.liftingCapacity,
                    this.category,
                    this.model,
                    this.price,
                    this.isNew);
        }
    }
}
