public class TeamStatistics {

    private String homeTeam;
    private int numberOfGames=0;
    private int numberOfWins=0;
    private int numberOfLosses=0;


    public TeamStatistics(String homeTeam, int numberOfGames,
                          int numberOfWins, int numberOfLosses) {
        this.homeTeam = homeTeam;
        this.numberOfGames = numberOfGames;
        this.numberOfWins = 0;
        this.numberOfLosses = numberOfLosses;

    }

    public void addWin(int Streak){
        numberOfWins+=Streak;
    }
    public void addGame(int Streak){

        numberOfGames+=Streak;
    }

    public void addLoss(int Streak) {
        numberOfLosses+=Streak;
    }

    public String getHomeTeam(){
        return homeTeam;
    }

    public String getWins(){
        String wins = String.format("Wins: %d", numberOfWins);
        return wins;
    }
    public String getLosses(){
        String loss = String.format("Losses: %d", numberOfLosses);
        return loss;
    }
    public String getGames(){
        String wins = String.format("Games: %d", numberOfGames);
        return wins;
    }


}