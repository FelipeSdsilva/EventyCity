package com.felipesouls.eventSistem.repositories;

import com.felipesouls.eventSistem.entities.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Integer, Participant> {
}
