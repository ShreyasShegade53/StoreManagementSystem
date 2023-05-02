package com.project.storemanagement.repository;

import com.project.storemanagement.domain.SoldProduct;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the SoldProduct entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SoldProductRepository extends JpaRepository<SoldProduct, Long> {}
