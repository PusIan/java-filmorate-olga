package ru.yandex.practicum.javafilmorate.dao;

import ru.yandex.practicum.javafilmorate.model.User;

import java.util.List;

public interface UserDao {

    User createUser(User user);

    User getUserById(int id);

    List<User> getAllUsers();

    User updateUser(User user);

    void addFriend(int id, int friendId);

    void delete(int id, int friendId);

    List<User> getCommonFriends(int id, int otherId);

    List<User> getAllFriends(int id);

    void isUserExisted(int id);

}
