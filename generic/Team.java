package generic;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    private int won = 0;
    private int tied = 0;
    private int  lost = 0;
    private int played = 0;

    List<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int ranking(){
        return (won * 2) + tied;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already in team " + this.name);
            return false;
        }else{
            System.out.println(player.getName() + " added to team " + this.name);
            return true;
        }
    }

    public void matchResults(Team<T> team, int team1Score, int team2Score){
        String message = null;
        if(team1Score > team2Score){
            won++;
            message = " won with ";
        }
        if(team2Score > team1Score){
            lost++;
            message = " lost with ";
        }
        if(team1Score==team2Score){
            tied++;
            message = " tied with ";
        }
        played++;
        if(team != null){
            System.out.println(this.name + message + team.getName());
            team.matchResults(null, team2Score, team1Score);
        }
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() == team.ranking()){
            return 0;
        }else if(this.ranking() > team.ranking()){
            return 1;
        }else{
            return -1;
        }
    }
}
