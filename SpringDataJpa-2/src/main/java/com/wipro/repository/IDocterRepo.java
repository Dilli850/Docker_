package com.wipro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.entity.Docter;

public interface IDocterRepo extends JpaRepository<Docter, Integer> {

}
