package com.bridgelabz.mygreeting.repository;

import com.bridgelabz.mygreeting.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}