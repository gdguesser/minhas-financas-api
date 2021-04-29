package com.guesser.myfinances.model.repository;

import com.guesser.myfinances.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseRepository extends JpaRepository<User, Long> {
}
