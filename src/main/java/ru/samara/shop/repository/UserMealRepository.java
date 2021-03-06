package ru.samara.shop.repository;

import ru.samara.shop.model.UserMeal;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by user on 13.07.2016.
 */
public interface UserMealRepository {
    // UserMeal.user = null
    UserMeal save(UserMeal userMeal, int userId);

    // false if not found
    boolean delete(int id, int userId);

    // null if not found
    UserMeal get(int id, int userId);

    // ORDERED DATE, TIME
    List<UserMeal> getAll(int userId);

    void deleteAll(int userId);

    List<UserMeal> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId);

}
