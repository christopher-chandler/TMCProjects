import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class SportStatistics {

    public static void calculateTeamStatistics(ArrayList<String[]> csvData,
                                               ArrayList<TeamStatistics>  trackTeamStatistics){

        for (String[] arg: csvData){
            String homeTeam =arg[0];
            String opposingTeam  =arg[1];
            int homeScore = Integer.valueOf(arg[2]);
            int opposingScore =Integer.valueOf(arg[3]);

            for (TeamStatistics team: trackTeamStatistics) {

                boolean isHomeTeam = team.getHomeTeam().equals(homeTeam);
                boolean isOpposingTeam = team.getHomeTeam().equals(opposingTeam);

                if (isHomeTeam){
                    team.addGame(1);
                    if (homeScore > opposingScore) {
                        team.addWin(1);
                    } else {
                        team.addLoss(1);
                    }
                }

                if (isOpposingTeam) {
                    team.addGame(1);
                    if (opposingScore > homeScore) {
                        team.addWin(1);

                    }
                }

            }

        }
    }

    public static boolean getUserTeamStatistics(String teamName, ArrayList<TeamStatistics> trackStatistics) {

        boolean teamExists = false;
        for (TeamStatistics team: trackStatistics) {
            if (team.getHomeTeam().equals(teamName)){
                System.out.println(team.getWins());
                System.out.println(team.getLosses());
                System.out.println(team.getGames());

                teamExists = true;
                break;
            }
        }
        return teamExists;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String dataFileName = scan.nextLine();
        ArrayList<TeamStatistics> trackTeamStatistics = new ArrayList<>();
        ArrayList<String[]> csvData = new ArrayList<>();
        ArrayList<String> teamNames = new ArrayList<>();

        try(Scanner incomingCSVFile = new Scanner(Paths.get(dataFileName))) {

            while (incomingCSVFile.hasNextLine()) {
                String line = incomingCSVFile.nextLine();

                String [] csvLineData = line.split(",");
                String homeName = csvLineData[0];
                String opposingName = csvLineData[1];


                if (!teamNames.contains(homeName)){
                    TeamStatistics team = new TeamStatistics(homeName,
                            0,0,0);
                    trackTeamStatistics.add(team);

                } if (!teamNames.contains(opposingName)){
                    TeamStatistics team = new TeamStatistics(opposingName,
                            0,0,0);
                    trackTeamStatistics.add(team);

                }
                teamNames.add(homeName);
                csvData.add(csvLineData);
            }

        } catch (Exception e ) {
            System.out.println(e);
        }

        System.out.println("Team:");
        String teamName = scan.nextLine();
        calculateTeamStatistics(csvData, trackTeamStatistics);

        boolean getTeam = getUserTeamStatistics(teamName, trackTeamStatistics);

        if (!getTeam) {
            TeamStatistics unknownTeam = new TeamStatistics(teamName,0,0,0);

            System.out.println(unknownTeam.getGames());
            System.out.println(unknownTeam.getLosses());
        }


    }

}