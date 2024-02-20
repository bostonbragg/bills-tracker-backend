package org.bostonbragg.billstracker.bills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class BillService {
    private final BillRepository repository;

    @Autowired
    public BillService(BillRepository repository) {
        this.repository = repository;
    }

    Bill save(Bill bill) {
        return repository.save(bill);
    }

    List<Bill> findAll() {
        return repository.findAll();
    }

    Bill findById(UUID id) {
        return repository.findById(id).orElseThrow();
    }

    void delete(UUID id) {
        repository.delete(findById(id));
    }
}
