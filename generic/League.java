package generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League <T extends Team>{
    private String name;

    List<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team){
        if(league.contains(team)){
            System.out.println(team.getName() + " is already in the league");
            return false;
        }else {
            league.add(team);
            System.out.println(team.getName() + " successfully added to league");
            return true;
        }
    }
    public void printLeagueTable(){
        Collections.sort(league);
        for (T team : league){
            System.out.println(team.getName() + " : " + team.ranking());
        }
    }
}
