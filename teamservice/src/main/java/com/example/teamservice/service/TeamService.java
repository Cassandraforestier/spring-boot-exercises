package com.example.teamservice.service;

import com.example.teamservice.model.Team;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    private final List<Team> teams = new ArrayList<>();

    public TeamService() {
        // Initialisation avec quelques équipes fictives
        teams.add(new Team(1L, "Équipe A", "Entraîneur A"));
        teams.add(new Team(2L, "Équipe B", "Entraîneur B"));
    }

    public Team getTeamById(Long id) {
        Optional<Team> teamOptional = teams.stream().filter(team -> team.getId().equals(id)).findFirst();
        return teamOptional.orElse(null);
    }

    public List<Team> getAllTeams() {
        return teams;
    }

    public Team addTeam(Team team) {
        // Génération d'un nouvel ID (simulé)
        Long newId = teams.stream().mapToLong(Team::getId).max().orElse(0L) + 1;
        team.setId(newId);
        teams.add(team);
        return team;
    }

    public Team updateTeam(Long id, Team updatedTeam) {
        Optional<Team> existingTeamOptional = teams.stream().filter(team -> team.getId().equals(id)).findFirst();

        if (existingTeamOptional.isPresent()) {
            Team existingTeam = existingTeamOptional.get();
            existingTeam.setName(updatedTeam.getName());
            existingTeam.setCoach(updatedTeam.getCoach());
            return existingTeam;
        } else {
            // Retournez null ou lancez une exception en fonction des besoins
            return null;
        }
    }

    public void deleteTeam(Long id) {
        teams.removeIf(team -> team.getId().equals(id));
    }
}

