package com.felipesouls.eventSistem.repositories;

import com.felipesouls.eventSistem.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlocRepository extends JpaRepository<Integer, Bloc> {
}
