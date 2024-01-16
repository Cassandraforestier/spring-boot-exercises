package com.example.playerservice.service;

import com.example.playerservice.model.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    private final List<Player> players = new ArrayList<>();

    public PlayerService() {
        players.add(new Player(1L, "joueur B", 11));
        players.add(new Player(2L, "joueur A", 7));
    }

    public Player getTeamById(Long id) {
        Optional<Player> playerOptional = players.stream().filter(player -> player.getId().equals(id)).findFirst();
        return playerOptional.orElse(null);
    }

    public List<Player> getAllPlayers() {
        return players;
    }

    public Player addplayer(Player player) {
        Long newId = players.stream().mapToLong(Player::getId).max().orElse(0L) + 1;
        player.setId(newId);
        players.add(player);
        return player;
    }

    public Player updatePLayer(Long id, Player updatePLayer) {
        Optional<Player> existingPlayerOptional = players.stream().filter(player -> player.getId().equals(id)).findFirst();

        if (existingPlayerOptional.isPresent()) {
            Player existingTeam = existingPlayerOptional.get();
            existingTeam.setName(updatePLayer.getName());
            existingTeam.setShirtNumber(updatePLayer.getShirtNumber());
            return existingTeam;
        } else {
            return null;
        }
    }

    public void deleteTeam(Long id) {
        players.removeIf(player -> player.getId().equals(id));
    }
}

