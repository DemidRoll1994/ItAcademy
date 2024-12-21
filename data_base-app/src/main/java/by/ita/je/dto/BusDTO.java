package by.ita.je.dto;

import java.math.BigDecimal;

public class BusDTO {

    private Long id;
    private byte seatsNumber;
    private String category;
    private String model;
    private BigDecimal price;
    private boolean isNew;

    public BusDTO(Long id, byte seatsNumber, String category, String model, BigDecimal price, boolean isNew) {
        this.id = id;
        this.seatsNumber = seatsNumber;
        this.category = category;
        this.model = model;
        this.price = price;
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

    public boolean isNew() {
        return isNew;
    }

    public static class Builder {
        private Long id;
        private byte seatsNumber;
        private String category;
        private String model;
        private BigDecimal price;
        private boolean isNew;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder seatsNumber(byte seatsNumber) {
            this.seatsNumber = seatsNumber;
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

        public BusDTO build() {
            return new BusDTO(
                    this.id,
                    this.seatsNumber,
                    this.category,
                    this.model,
                    this.price,
                    this.isNew
            );
        }
    }
}
