package com.example.matchservice.model;

public class Match {
    private Long id;

    private String team1;
    private String team2;
    private String result;

    public Match(Long id, String team1, String team2, String result) {
        this.id = id;
        this.team1 = team1;
        this.team2 = team2;
        this.result = result;
    }

    public Match() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
