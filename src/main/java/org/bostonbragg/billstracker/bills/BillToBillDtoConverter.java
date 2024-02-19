package org.bostonbragg.billstracker.bills;

import org.bostonbragg.billstracker.converters.ConversionMapper;
import org.bostonbragg.billstracker.converters.Converter;
import org.bostonbragg.billstracker.due.DueDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BillToBillDtoConverter extends Converter<Bill, BillDto> {

    ConversionMapper converter;

    @Autowired
    public BillToBillDtoConverter(ConversionMapper converter) {
        this.converter = converter;
    }

    @Override
    public BillDto apply(Bill bill) {
        BillDto billDto = new BillDto();
        billDto.setId(bill.getId());
        billDto.setName(bill.getName());
        billDto.setAmount(bill.getAmount());
        billDto.setDue(converter.convert(bill.getDue(), DueDto.class));
        billDto.setStartDate(bill.getStartDate());
        billDto.setEndDate(bill.getEndDate());
        return billDto;
    }
}
