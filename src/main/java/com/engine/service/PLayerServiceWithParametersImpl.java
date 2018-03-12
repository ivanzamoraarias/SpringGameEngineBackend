package com.engine.service;

import java.util.List;

import com.engine.model.Player;
import com.engine.repository.PlayerRepository;

public class PLayerServiceWithParametersImpl implements PlayerService {

	private PlayerRepository playerRepository;
	
	public PLayerServiceWithParametersImpl() {
		// TODO Auto-generated constructor stub
	}
	public PLayerServiceWithParametersImpl(PlayerRepository playerRep) {
		playerRepository = playerRep;
		
	}
	@Override
	public List<Player> findAll(){
		return playerRepository.findAll();
	}

	public PlayerRepository getPlayerRepository() {
		return playerRepository;
	}

	public void setPlayerRepository(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}
}
