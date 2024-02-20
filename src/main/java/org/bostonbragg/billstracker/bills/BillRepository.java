package org.bostonbragg.billstracker.bills;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Component
@Repository
public interface BillRepository extends JpaRepository<Bill, UUID> {
}
