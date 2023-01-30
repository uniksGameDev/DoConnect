package com.wipro.doconnect.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wipro.doconnect.chat.entity.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long>
{

}
