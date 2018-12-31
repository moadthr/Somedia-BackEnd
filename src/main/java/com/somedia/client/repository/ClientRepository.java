package com.somedia.client.repository;

import com.somedia.client.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientRepository extends JpaRepository<Client, Long> {
    @Query("SELECT c FROM Client c WHERE c.email = ?1 AND c.password = ?2")
    Client findByClientByEmailAndPassword(String email, String password);
}
