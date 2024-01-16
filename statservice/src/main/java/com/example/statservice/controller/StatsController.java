package com.example.statservice.controller;

import com.example.statservice.model.TeamStats;
import com.example.statservice.model.PlayerStats;
import com.example.statservice.service.StatsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stats")
@Api(tags = "Stats Controller", description = "Operations pertaining to statistics")
public class StatsController {
    private final StatsService statsService;

    @Autowired
    public StatsController(StatsService statsService) {
        this.statsService = statsService;
    }

    @GetMapping("/team-stats/{teamId}")
    @ApiOperation(value = "Get team statistics by team ID", response = TeamStats.class)
    public TeamStats getTeamStats(@PathVariable Long teamId) {
        return statsService.getTeamStats(teamId);
    }

    @GetMapping("/player-stats/{playerId}")
    @ApiOperation(value = "Get player statistics by player ID", response = PlayerStats.class)
    public PlayerStats getPlayerStats(@PathVariable Long playerId) {
        return statsService.getPlayerStats(playerId);
    }
}
