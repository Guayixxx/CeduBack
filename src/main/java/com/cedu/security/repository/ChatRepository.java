package com.cedu.security.repository;

import com.cedu.security.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;


@Repository
public interface ChatRepository extends JpaRepository<Chat, Integer> {

    HashSet<Chat> getChatByFirstUserName(String username);

    HashSet<Chat> getChatBySecondUserName(String username);

    HashSet<Chat> getChatByFirstUserNameAndSecondUserName(String firstUserName, String secondUserName);

    HashSet<Chat> getChatBySecondUserNameAndFirstUserName(String firstUserName, String secondUserName);
}
