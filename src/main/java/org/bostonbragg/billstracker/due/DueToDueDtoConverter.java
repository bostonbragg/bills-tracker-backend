package org.bostonbragg.billstracker.due;

import org.bostonbragg.billstracker.converters.Converter;
import org.springframework.stereotype.Component;

@Component
public class DueToDueDtoConverter extends Converter<Due, DueDto> {
    @Override
    public DueDto apply(Due due) {
        DueDto dueDto = new DueDto();
        dueDto.setPaymentFrequency(due.getPaymentFrequency());
        dueDto.setDayOfTheWeek(due.getDayOfTheWeek());
        dueDto.setDateOfTheMonth(due.getDateOfTheMonth());
        dueDto.setMonthOfTheYear(due.getMonthOfTheYear());
        return dueDto;
    }
}
