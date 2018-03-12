package com.engine.repository;

import java.util.List;

import com.engine.model.Player;

public interface PlayerRepository {

	List<Player> findAll();

}