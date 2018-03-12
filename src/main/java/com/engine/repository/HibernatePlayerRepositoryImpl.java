package com.engine.repository;

import java.util.ArrayList;
import java.util.List;

import com.engine.model.Player;

public class HibernatePlayerRepositoryImpl implements PlayerRepository {
	
	/* (non-Javadoc)
	 * @see com.engine.repository.PlayerRepository#findAll()
	 */
	@Override
	public List<Player> findAll(){
		List<Player> players = new ArrayList<>();
		Player player = new Player();
		player.setFirstName("Ivan");
		player.setLastName("Zamora");
		
		players.add(player);
		
		return players;
	}

}
