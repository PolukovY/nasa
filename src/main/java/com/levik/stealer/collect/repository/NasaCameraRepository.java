package com.levik.stealer.collect.repository;

import com.levik.stealer.collect.repository.entity.NasaCameraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NasaCameraRepository extends JpaRepository<NasaCameraEntity, Long> {
}
