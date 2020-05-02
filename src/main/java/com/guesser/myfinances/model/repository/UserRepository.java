package com.guesser.myfinances.model.repository;

import com.guesser.myfinances.model.entity.Release;
import com.guesser.myfinances.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
