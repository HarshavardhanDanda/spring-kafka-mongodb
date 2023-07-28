package com.kafka.springboot.repository;

import com.kafka.springboot.entity.Wikimedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<Wikimedia, Long> {
}
