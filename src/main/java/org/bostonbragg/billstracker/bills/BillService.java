package org.bostonbragg.billstracker.bills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class BillService {
    private BillRepository repository;

    @Autowired
    public BillService(BillRepository repository) {
        this.repository = repository;
    }

    Bill createBill(Bill bill) {
        return repository.createBill(bill);
    }

    List<Bill> getBills() {
        return repository.getBills();
    }

    Bill getBillById(UUID id) {
        return repository.getBillById(id).orElseThrow();
    }

    Bill modifyBill(UUID id, Bill bill) {
        return repository.modifyBill(id, bill).orElseThrow();
    }

    void deleteBill(UUID id) {
        repository.deleteBill(id);
    }
}
