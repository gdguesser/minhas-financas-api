package com.guesser.myfinances.model.repository;

import com.guesser.myfinances.model.entity.Release;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Release, Long> {
}
