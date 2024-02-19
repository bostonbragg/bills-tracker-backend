package org.bostonbragg.billstracker.due;

import java.util.Objects;

public class Due {
    private PaymentFrequencyEnum paymentFrequency;
    private DayOfTheWeekEnum dayOfTheWeek;
    private int dateOfTheMonth;
    private int monthOfTheYear;

    public Due(Builder builder) {
        this.paymentFrequency = builder.paymentFrequency;
        this.dayOfTheWeek = builder.dayOfTheWeek;
        this.dateOfTheMonth = builder.dateOfTheMonth;
        this.monthOfTheYear = builder.monthOfTheYear;
    }

    public PaymentFrequencyEnum getPaymentFrequency() {
        return paymentFrequency;
    }

    public void setPaymentFrequency(PaymentFrequencyEnum paymentFrequency) {
        this.paymentFrequency = paymentFrequency;
    }

    public DayOfTheWeekEnum getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(DayOfTheWeekEnum dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public int getDateOfTheMonth() {
        return dateOfTheMonth;
    }

    public void setDateOfTheMonth(int dateOfTheMonth) {
        this.dateOfTheMonth = dateOfTheMonth;
    }

    public int getMonthOfTheYear() {
        return monthOfTheYear;
    }

    public void setMonthOfTheYear(int monthOfTheYear) {
        this.monthOfTheYear = monthOfTheYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Due due = (Due) o;
        return dateOfTheMonth == due.dateOfTheMonth && monthOfTheYear == due.monthOfTheYear && paymentFrequency == due.paymentFrequency && dayOfTheWeek == due.dayOfTheWeek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentFrequency, dayOfTheWeek, dateOfTheMonth, monthOfTheYear);
    }

    @Override
    public String toString() {
        return "Due{" +
                "paymentFrequency=" + paymentFrequency +
                ", dayOfTheWeek=" + dayOfTheWeek +
                ", dateOfTheMonth=" + dateOfTheMonth +
                ", monthOfTheYear=" + monthOfTheYear +
                '}';
    }

    public static class Builder {
        private PaymentFrequencyEnum paymentFrequency;
        private DayOfTheWeekEnum dayOfTheWeek;
        private int dateOfTheMonth;
        private int monthOfTheYear;

        public Builder paymentFrequency(PaymentFrequencyEnum paymentFrequency) {
            this.paymentFrequency = paymentFrequency;
            return this;
        }

        public Builder dayOfTheWeek(DayOfTheWeekEnum dayOfTheWeek) {
            this.dayOfTheWeek = dayOfTheWeek;
            return this;
        }

        public Builder dateOfTheMonth(int dateOfTheMonth) {
            this.dateOfTheMonth = dateOfTheMonth;
            return this;
        }

        public Builder monthOfTheYear(int monthOfTheYear) {
            this.monthOfTheYear = monthOfTheYear;
            return this;
        }

        public Due build() {
            return new Due(this);
        }
    }
}
