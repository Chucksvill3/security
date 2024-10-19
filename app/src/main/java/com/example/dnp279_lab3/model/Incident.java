package com.example.dnp279_lab3.model;

import androidx.annotation.NonNull;

public class Incident {
    private String id;
    private String type;
    private String level;
    private String time;
    private  String status;
    private String team;
    public Incident(String id, String type, String level, String time, String status, String team){
        this.id = id;
        this.type = type;
        this.level = level;
        this.time = time;
        this.status = status;
        this.team= team;
    }
    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getLevel(){
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    public String getTime(){
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }

    public String getTeam(){
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    public String getStatus(){
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @NonNull
    @Override
    public String toString() {
        return
                "priorityLevel: " + level + " Status: " + status  + " Team: "+ team + " Type: " + type  ;

    }
}




