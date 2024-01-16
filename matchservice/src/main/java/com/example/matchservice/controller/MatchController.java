package com.example.matchservice.controller;

import com.example.matchservice.model.Match;
import com.example.matchservice.service.MatchService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matches")
@Api(tags = "Match Controller", description = "Operations pertaining to matches")
public class MatchController {
    private final MatchService matchService;

    @Autowired
    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Get a match by ID", response = Match.class)
    public Match getMatch(@PathVariable Long id) {
        return matchService.getMatchById(id);
    }

    @GetMapping
    @ApiOperation(value = "Get all matches", response = List.class)
    public List<Match> getAllMatches() {
        return matchService.getAllMatches();
    }

    @PostMapping
    @ApiOperation(value = "Add a new match", response = Match.class)
    public Match addMatch(@RequestBody Match match) {
        return matchService.addMatch(match);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update a match by ID", response = Match.class)
    public Match updateMatch(@PathVariable Long id, @RequestBody Match updatedMatch) {
        return matchService.updateMatch(id, updatedMatch);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete a match by ID")
    public void deleteMatch(@PathVariable Long id) {
        matchService.deleteMatch(id);
    }
}
