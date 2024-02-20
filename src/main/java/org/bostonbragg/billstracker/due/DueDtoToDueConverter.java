package org.bostonbragg.billstracker.due;

import org.bostonbragg.billstracker.converters.Converter;
import org.springframework.stereotype.Component;

@Component
public class DueDtoToDueConverter extends Converter<DueDto, Due> {
    @Override
    protected Due apply(DueDto dueDto) {
        return Due.builder().paymentFrequency(dueDto.getPaymentFrequency()).dayOfTheWeek(dueDto.getDayOfTheWeek()).dateOfTheMonth(dueDto.getDateOfTheMonth()).monthOfTheYear(dueDto.getMonthOfTheYear()).build();
    }
}
