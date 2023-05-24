package com.core.web;

import com.core.dao.DBConnect;
import com.core.models.Player;
import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.stream.Collectors;

@Named(value = "playerManager")
@ApplicationScoped
public class PlayerManager {

    private final List<Player> players =new DBConnect().getPlayers();;
    private List<Player> currentPlayers;
    private int limit;
    private double percentage;
    
    public PlayerManager() {
//        this.players = new DBConnect().getPlayers();
        this.currentPlayers = new ArrayList<>();
    }
    
    public String topGoalers(){
        currentPlayers = players.stream()
                .sorted((p1,p2)->(int)(p2.getGoles()-p1.getGoles()))
                .limit(limit)
                .collect(Collectors.toList());
        return "results";
    }

    public String reset(){
        this.currentPlayers = new ArrayList<>();
        limit = 0;
        percentage = 0;
        return "index";
    }
    
    public List<Player> getCurrentPlayers() {
        return currentPlayers;
    }

    public void setCurrentPlayers(List<Player> currentPlayers) {
        this.currentPlayers = currentPlayers;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    
}
