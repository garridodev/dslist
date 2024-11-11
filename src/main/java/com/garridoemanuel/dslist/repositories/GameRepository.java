package com.garridoemanuel.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garridoemanuel.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
