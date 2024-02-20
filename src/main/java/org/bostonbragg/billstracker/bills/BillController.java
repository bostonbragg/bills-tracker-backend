package org.bostonbragg.billstracker.bills;

import org.bostonbragg.billstracker.converters.ConversionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/bills")
@Component
public class BillController {
    private final BillService service;
    private final ConversionMapper converter;

    @Autowired
    public BillController(BillService service, ConversionMapper converter) {
        this.service = service;
        this.converter = converter;
    }

    @PostMapping("")
    public BillDto postBill(@RequestBody BillDto billDto) {
        return converter.convert(service.save(converter.convert(billDto, Bill.class)),
                BillDto.class);
    }

    @GetMapping("")
    public List<BillDto> getBills() {
        return converter.convertList(service.findAll(), BillDto.class);
    }

    @GetMapping("/{id}")
    public BillDto getBillById(@PathVariable("id") UUID id) {
        return converter.convert(service.findById(id), BillDto.class);
    }

    @PutMapping("/{id}")
    public BillDto modifyBill(@PathVariable("id") UUID id, @RequestBody BillDto billDto) {
        if (!id.equals(billDto.getId())) {
           throw new RuntimeException();
        }
        return converter.convert(service.save(converter.convert(billDto, Bill.class)),
                BillDto.class);
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable("id") UUID id) {
        service.delete(id);
    }
}
