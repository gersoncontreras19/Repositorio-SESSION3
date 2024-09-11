package com.example.session1semana2.repository;

import com.example.session1semana2.models.Facturas;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Repository extends JpaRepository<Facturas, Long> {
}
