package com.hartwig.cosmetic.admin.repository;

import com.hartwig.cosmetic.admin.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
