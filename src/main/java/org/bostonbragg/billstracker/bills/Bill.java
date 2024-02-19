package org.bostonbragg.billstracker.bills;

import org.bostonbragg.billstracker.due.Due;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Component
public class Bill {
    @NonNull private UUID id;
    private String name;
    private double amount;
    private Due due;
    private Date startDate;
    private Date endDate;

    public Bill(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.amount = builder.amount;
        this.due = builder.due;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Due getDue() {
        return due;
    }

    public void setDue(Due due) {
        this.due = due;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return Objects.equals(id, bill.id) && Double.compare(amount, bill.amount) == 0 && Objects.equals(name, bill.name) && Objects.equals(due, bill.due) && Objects.equals(startDate, bill.startDate) && Objects.equals(endDate, bill.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, amount, due, startDate, endDate);
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", due=" + due +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    @Component
    public static class Builder {
        private UUID id;
        private String name;
        private double amount;
        private Due due;
        private Date startDate;
        private Date endDate;

        public Builder id(UUID id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder due(Due due) {
            this.due = due;
            return this;
        }

        public Builder startDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder endDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }

        Bill build() {
            return new Bill(this);
        }
    }
}
