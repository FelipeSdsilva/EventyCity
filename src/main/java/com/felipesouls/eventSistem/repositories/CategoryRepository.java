package com.felipesouls.eventSistem.repositories;

import com.felipesouls.eventSistem.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
