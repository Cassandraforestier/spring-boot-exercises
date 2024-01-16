package com.example.statservice.service;

import com.example.statservice.model.TeamStats;
import com.example.statservice.model.PlayerStats;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class StatsService {
private final Random random = new Random();

public TeamStats getTeamStats(Long teamId) {
    // Generate fake team statistics for demonstration purposes
    int goalsScored = random.nextInt(50) + 1; // Random goals scored between 1 and 50
    int goalsConceded = random.nextInt(30) + 1; // Random goals conceded between 1 and 30
    int wins = random.nextInt(10);
    int draws = random.nextInt(5);
    int losses = random.nextInt(5);

    return new TeamStats(teamId, goalsScored, goalsConceded, wins, draws, losses);
}

public PlayerStats getPlayerStats(Long playerId) {
    // Generate fake player statistics for demonstration purposes
    int goalsScored = random.nextInt(20);
    int assists = random.nextInt(15);
    int yellowCards = random.nextInt(5);
    int redCards = random.nextInt(2);

    return new PlayerStats(playerId, goalsScored, assists, yellowCards, redCards);
}
}