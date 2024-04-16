package com.Cricket.Cricbuzz.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Cricket.Cricbuzz.model.admin;

public interface adminRepo extends JpaRepository<admin,Long>{

	Optional<admin> findByUsername(String username);

}
