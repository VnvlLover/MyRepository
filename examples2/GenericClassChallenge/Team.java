package examples2.GenericClassChallenge;

import java.util.List;

public class Team extends League{
    private String name;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    public Team(List<Team> leagueTeams, String name) {
        super(leagueTeams);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
