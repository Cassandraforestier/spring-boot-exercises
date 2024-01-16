package com.example.matchservice.service;

import com.example.matchservice.model.Match;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MatchService {
    private final List<Match> matches = new ArrayList<>();

    public MatchService() {
        // Initialization with some fictitious matches
        matches.add(new Match(1L, "Team A", "Team B", "Result A vs. B"));
        matches.add(new Match(2L, "Team C", "Team D", "Result C vs. D"));
    }

    public Match getMatchById(Long id) {
        Optional<Match> matchOptional = matches.stream().filter(match -> match.getId().equals(id)).findFirst();
        return matchOptional.orElse(null);
    }

    public List<Match> getAllMatches() {
        return matches;
    }

    public Match addMatch(Match match) {
        // Simulated generation of a new ID
        Long newId = matches.stream().mapToLong(Match::getId).max().orElse(0L) + 1;
        match.setId(newId);
        matches.add(match);
        return match;
    }

    public Match updateMatch(Long id, Match updatedMatch) {
        Optional<Match> existingMatchOptional = matches.stream().filter(match -> match.getId().equals(id)).findFirst();

        if (existingMatchOptional.isPresent()) {
            Match existingMatch = existingMatchOptional.get();
            existingMatch.setTeam1(updatedMatch.getTeam1());
            existingMatch.setTeam2(updatedMatch.getTeam2());
            existingMatch.setResult(updatedMatch.getResult());
            return existingMatch;
        } else {
            // Return null or throw an exception based on requirements
            return null;
        }
    }

    public void deleteMatch(Long id) {
        matches.removeIf(match -> match.getId().equals(id));
    }
}
