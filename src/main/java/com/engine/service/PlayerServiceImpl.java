package com.engine.service;

import java.util.List;

import com.engine.model.Player;
import com.engine.repository.PlayerRepository;

public class PlayerServiceImpl implements PlayerService {
	
	private PlayerRepository playerRepository;
	
	/* (non-Javadoc)
	 * @see com.engine.service.PlayerService#findAll()
	 */
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
