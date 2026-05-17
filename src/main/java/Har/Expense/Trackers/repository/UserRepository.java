package Har.Expense.Trackers.repository;

import Har.Expense.Trackers.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    // Spring generates query automatically.
    // SELECT * FROM users WHERE username = ?
}
