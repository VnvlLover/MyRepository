package generic;

public class Main {
    public static void main(String[] args) {
        SoccerPlayer kokos = new SoccerPlayer("Kokos");
        SoccerPlayer macius = new SoccerPlayer("Macius");
        SoccerPlayer paulila = new SoccerPlayer("Paulila");

        SoccerPlayer mama = new SoccerPlayer("Mama");
        SoccerPlayer tata = new SoccerPlayer("Tata");
        SoccerPlayer michal = new SoccerPlayer("Michal");

        Team<SoccerPlayer> bytow = new Team<>("Bytow");
        bytow.addPlayer(kokos);
        bytow.addPlayer(macius);
        bytow.addPlayer(paulila);

        Team<SoccerPlayer> borne = new Team<>("Borne Sulinowo");
        borne.addPlayer(mama);
        borne.addPlayer(tata);
        borne.addPlayer(michal);

        League<Team<SoccerPlayer>> soccerPlayerLeague = new League<>("Soccer League");
        soccerPlayerLeague.addTeam(bytow);
        soccerPlayerLeague.addTeam(borne);

        bytow.matchResults(borne, 2, 3);
        bytow.matchResults(borne, 3, 3);
        bytow.matchResults(borne, 5, 3);
        bytow.matchResults(borne, 5, 3);
        bytow.matchResults(borne, 2, 3);
        bytow.matchResults(borne, 2, 3);


        soccerPlayerLeague.printLeagueTable();




    }
}
