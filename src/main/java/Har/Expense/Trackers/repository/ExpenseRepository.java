package Har.Expense.Trackers.repository;

import Har.Expense.Trackers.model.Expense;
import Har.Expense.Trackers.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

// Expens Table database operations
public interface ExpenseRepository extends JpaRepository<Expense,Long> {
    List<Expense> findByUser(Optional<User> user);
    List<Expense> findByUserId(Long userId);
    List<Expense> findByCategory(Expense.Category category);

}
