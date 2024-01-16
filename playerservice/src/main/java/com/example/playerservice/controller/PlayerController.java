package com.example.playerservice.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
@Api(tags = "Player Management", description = "Endpoints for managing players")
public class PlayerController {

    @GetMapping("/{id}")
    @ApiOperation(value = "Get player details by ID", notes = "Provide an ID to get details of a specific player")
    public String getPlayer(@PathVariable Long id) {
        return "Details of player with ID " + id;
    }

    @GetMapping
    @ApiOperation(value = "Get all players", notes = "Get a list of all players")
    public List<String> getAllPlayers() {
        return List.of("Player1", "Player2", "Player3");
    }

    @PostMapping
    @ApiOperation(value = "Add a new player", notes = "Provide player name in the request body to add a new player")
    public String addPlayer(@RequestBody String playerName) {
        return "Player " + playerName + " added successfully";
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update player details by ID", notes = "Provide an ID and player details in the request body to update a player")
    public String updatePlayer(@PathVariable Long id, @RequestBody String updatePlayerName) {
        return "Player with ID " + id + " updated successfully";
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete player by ID", notes = "Provide an ID to delete a specific player")
    public String deletePlayer(@PathVariable Long id) {
        return "Player with ID " + id + " deleted successfully";
    }
}
