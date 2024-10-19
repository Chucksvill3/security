package com.example.dnp279_lab3.model;

public class ResponseTeam {
    // Fields to store the ID, team name, leader name, and additional info of the response team
    private String id;
    private String teamName;
    private String leaderName;
    private String info;

    // Constructor to initialize the ResponseTeam object with given values
    public ResponseTeam(String id, String teamName, String leaderName, String info) {
        this.id = id;
        this.teamName = teamName;
        this.leaderName = leaderName;
        this.info = info;
    }

    // Getter method for the ID field
    public String getId() {
        return id;
    }

    // Setter method for the ID field
    public void setId(String id) {
        this.id = id;
    }

    // Getter method for the team name field
    public String getTeamName() {
        return teamName;
    }

    // Setter method for the team name field
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    // Getter method for the leader name field
    public String getLeaderName() {
        return leaderName;
    }

    // Setter method for the leader name field
    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    // Getter method for the info field
    public String getInfo() {
        return info;
    }

    // Setter method for the info field
    public void setInfo(String info) {
        this.info = info;
    }
}
