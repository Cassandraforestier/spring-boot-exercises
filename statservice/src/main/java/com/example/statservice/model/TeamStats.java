package com.example.statservice.model;

public class TeamStats {
    private Long teamId;
    private int goalsScored;
    private int goalsConceded;
    private int wins;
    private int draws;
    private int losses;


    public TeamStats(Long teamId, int goalsScored, int goalsConceded, int wins, int draws, int losses) {
        this.teamId = teamId;
        this.goalsScored = goalsScored;
        this.goalsConceded = goalsConceded;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
    }

    public TeamStats() {

    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }
}
