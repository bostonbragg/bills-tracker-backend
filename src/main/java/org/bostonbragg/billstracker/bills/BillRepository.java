package org.bostonbragg.billstracker.bills;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class BillRepository {
    private List<Bill> bills = new ArrayList<>();

    Bill createBill(Bill bill) {
        bill.setId(UUID.randomUUID());
        bills.add(bill);
        return bill;
    }

    List<Bill> getBills() {
        return bills;
    }

    Optional<Bill> getBillById(UUID id) {
        return bills.stream().filter(bill -> bill.getId().equals(id)).findFirst();
    }

    Optional<Bill> modifyBill(UUID id, Bill bill) {
        Bill oldBill = getBillById(id).orElseThrow();
        bills.remove(oldBill);
        bills.add(bill);
        return getBillById(id);
    }

    void deleteBill(UUID id) {
        Bill bill = getBillById(id).orElseThrow();
        bills.remove(bill);
    }
}
