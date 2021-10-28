package com.mariam.demotest.repositories;

import com.mariam.demotest.models.EnneagramType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnneagramTypeRepository extends JpaRepository<EnneagramType, Integer> {

    EnneagramType findByIndex (int index);
}
