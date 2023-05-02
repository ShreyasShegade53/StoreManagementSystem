package com.project.storemanagement.repository;

import com.project.storemanagement.domain.StoreName;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the StoreName entity.
 */
@SuppressWarnings("unused")
@Repository
public interface StoreNameRepository extends JpaRepository<StoreName, Long> {}
