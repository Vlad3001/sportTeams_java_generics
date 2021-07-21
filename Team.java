package chalange088;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>>{

    private int wins =0, lose=0, played = 0;
    private String nameTeam;
    private List<Player> allPlayers = new ArrayList<>();

    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public int getWins() {
        return wins;
    }

    public int getLose() {
        return lose;
    }

    public int getPlayed() {
        return played;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public List<Player> getAllPlayers() {
        return allPlayers;
    }

    public boolean addPlayer(T player){
        if(allPlayers.contains(player)){
            System.out.println(player.getName()+" is already exist");
            return  false;
        }else{
            allPlayers.add(player);
            System.out.println(player.getName()+", welcome to team!");
            return true;
        }
    }

    public void matchResult(Team opponent, int theyScore, int ourScore){
        if(ourScore>theyScore){
            wins++;
        }else if(ourScore<theyScore){
            lose++;
        }else{
            System.out.println("match cant be tied...");
        }
    }

    public int ranking(){
        return (wins*2) - lose;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking()>team.ranking()) {
            return -1;
        } else if(this.ranking()<team.ranking()){
                return 1;
        }else {
            return 0;
        }
    }
}
