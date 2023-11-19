package com.felipesouls.eventSistem.repositories;

import com.felipesouls.eventSistem.entities.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
}
