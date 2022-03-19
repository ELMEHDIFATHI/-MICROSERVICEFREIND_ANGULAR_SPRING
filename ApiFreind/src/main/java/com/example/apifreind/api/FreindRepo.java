package com.example.apifreind.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreindRepo extends JpaRepository<Freind,Long> {




}
