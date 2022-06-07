package examples2.GenericClassChallenge;

import java.util.ArrayList;
import java.util.List;

public class League<T extends Team> {
    List<T> leagueTeams = new ArrayList<T>();

    public League(List<Team> leagueTeams) {
        this.leagueTeams = (List<T>) leagueTeams;
    }

    public List<Team> getLeagueTeams() {
        return (List<Team>) leagueTeams;
    }
}
