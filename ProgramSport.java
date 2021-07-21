package chalange088;

public class ProgramSport {
    public static void main(String[] args) {

        BasketballPlayer yoni = new BasketballPlayer("Yoni");
        BasketballPlayer bonbon = new BasketballPlayer("Bosh");

        FootballPlayer yosi = new FootballPlayer("yosi");
        FootballPlayer asi = new FootballPlayer("Asi");

        Team<BasketballPlayer> lakers = new Team<>("Lakers");
        lakers.addPlayer(yoni);
        //lakers.addPlayer(bonbon);

        Team<FootballPlayer> maccabi = new Team<>("Maccabi");
        maccabi.addPlayer(yosi);
        //maccabi.addPlayer(asi);
        maccabi.addPlayer(yosi);

        Team<BasketballPlayer> bulls = new Team<>("Bulls");
        lakers.addPlayer(bonbon);
        //lakers.addPlayer(bonbon);

        Team<FootballPlayer> barca = new Team<>("Barca");
        maccabi.addPlayer(asi);
        //maccabi.addPlayer(asi);

        lakers.matchResult(bulls, 124, 125);
        bulls.matchResult(lakers, 125, 124);
        barca.matchResult(maccabi, 1, 4);
        maccabi.matchResult(barca, 0, 0);

        System.out.println(lakers.getNameTeam() + "rank: " + lakers.ranking());
        System.out.println(maccabi.getNameTeam() + "rank: " + maccabi.ranking());
        System.out.println(bulls.getNameTeam() + "rank: " + bulls.ranking());
        System.out.println(barca.getNameTeam() + "rank: " + barca.ranking());

    }
}
