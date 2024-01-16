package com.example.teamservice.controller;

import com.example.teamservice.model.Team;
import com.example.teamservice.service.TeamService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
@Api(tags = "Team Controller", description = "Operations pertaining to teams")
public class TeamController {
    private final TeamService teamService;
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Get team by ID", response = Team.class)
    public Team getTeam(@PathVariable Long id) {
        return teamService.getTeamById(id);
    }

    @GetMapping
    @ApiOperation(value = "Get all teams", response = List.class)
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    @PostMapping
    @ApiOperation(value = "Add a new team", response = Team.class)
    public Team addTeam(@RequestBody Team team) {
        return teamService.addTeam(team);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update team by ID", response = Team.class)
    public Team updateTeam(@PathVariable Long id, @RequestBody Team updatedTeam) {
        return teamService.updateTeam(id, updatedTeam);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete team by ID")
    public void deleteTeam(@PathVariable Long id) {
        teamService.deleteTeam(id);
    }
}
