package org.bostonbragg.billstracker.due;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DueDto {
    private PaymentFrequencyEnum paymentFrequency;
    private DayOfTheWeekEnum dayOfTheWeek;
    private int dateOfTheMonth;
    private int monthOfTheYear;

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
}
