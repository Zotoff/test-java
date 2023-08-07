package com.example.demo.repository;


import com.example.demo.models.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * код, который работает с базой
 */

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

   // save

}
