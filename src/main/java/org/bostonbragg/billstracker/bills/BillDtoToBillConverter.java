package org.bostonbragg.billstracker.bills;

import org.bostonbragg.billstracker.converters.ConversionMapper;
import org.bostonbragg.billstracker.converters.Converter;
import org.bostonbragg.billstracker.due.Due;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BillDtoToBillConverter extends Converter<BillDto, Bill> {

    private ConversionMapper converter;

    @Autowired
    public BillDtoToBillConverter(ConversionMapper converter) {
        this.converter = converter;
    }

    @Override
    protected Bill apply(BillDto billDto) {
        return Bill.builder().id(billDto.getId()).name(billDto.getName()).amount(billDto.getAmount()).due(converter.convert(billDto.getDue(), Due.class)).startDate(billDto.getStartDate()).endDate(billDto.getEndDate()).build();
    }
}
