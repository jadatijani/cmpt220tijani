package lab6;
import java.util.*;
class Player {
   private String name;
   private int goals;
   private String team;
  
   Player() {
      name = team = "";
      goals = 0;
   }
   
   Player(String name, int goal, String team) {
      this.name = name;
      this.goals = goal;
      this.team = team;
   }

   void setName(String name) {
      this.name = name;
   }
   
   void setTeam(String team) {
      this.team = team;
   }

   void setGoals(int goals) {
      this.goals = goals;
   }
   
   String getName() {
      return name; 
   }
   
   String getTeam() {
      return team;
   }

   int getGoals() {
      return goals;
   }

   public String toString() {
      return "\n Player Name: " + name + "\t Team: " + team + "\t Goals: " + goals;
   }
}

class Goal {
   private int minute;
   private Player player;

   Goal() {
      minute = 0;
      player = null;
   }
   Goal(int min, Player p) {
      minute = min;
      player = p;
   }

   void setMinute(int minute) {
      this.minute = minute;
   }

   void setPlayer(Player player) {
      this.player = player;
   }

   int getMinute() {
      return minute;
   }
   
   Player getPlayer() {
      return player;
   }

   public String toString() {
      return "\n Minute at which the goal is scored: " + minute + "\n This player scored the goal: " + player.getName();
   }
}

public class SoccerMatch {
   Date startTime;
   Date endTime;
   String whereabouts;
   String home;
   String visitor;
   Player homePlayers[];
   Player visitorPlayers[];
   Goal homeGoals[];
   Goal visitorGoals[];
   int homePlayerCounter, visitPlayerCounter;
   int homeGoalCounter, visitGoalCounter;

   SoccerMatch() {
      startTime = endTime = null;
      whereabouts = home = visitor = null;
      homePlayers = new Player[11];
      visitorPlayers = new Player[11];
      homeGoals = new Goal[10];
      visitorGoals = new Goal[10];
      homePlayerCounter = visitPlayerCounter = homeGoalCounter = visitGoalCounter = 0;

      for(int x = 0; x < 11; x++) {
         homePlayers[x] = new Player();
         visitorPlayers[x] = new Player();
      }
      
      for(int x = 0; x < 10; x++) {
         homeGoals[x] = new Goal();
         visitorGoals[x] = new Goal();
      }   
   }

   SoccerMatch(Date st, Date et, String wa, String ho, String vi) {
      this();
      startTime = st;
      endTime = et;
      whereabouts = wa;
      home = ho;
      visitor = vi;
   }
   
   void addHomePlayer(Player p) {
      homePlayers[homePlayerCounter++] = p;
   }
   
   void addVisitorPlayer(Player p) {
      visitorPlayers[visitPlayerCounter++] = p;
   }

   void addHomeGoal(Goal g) {
      homeGoals[homeGoalCounter++] = g;
   }

   void addVisitorGoal(Goal g) {
      visitorGoals[visitGoalCounter++] = g;
   }
   
   int [] getHomeGoals() {
      int goals[] = new int[10];   
      for(int x = 0; x < 10; x++)
         goals[x] = homeGoals[x].getPlayer().getGoals();
      return goals;
   }
   
   int [] getVisitorGoals() {
      int goals[] = new int[10];
      for(int x = 0; x < 10; x++)
         goals[x] = visitorGoals[x].getPlayer().getGoals();
      return goals;
   }
   
   String getWinner() {
      String winStatus = "";
      int homeGoals[] = getHomeGoals();
      int visitGoals[] = getVisitorGoals();
      int totHome = 0, totVisit = 0;
   
      for(int x = 0; x < 10; x++) {      
         totHome += homeGoals[x];      
         totVisit += visitGoals[x];
      }   
      winStatus = "\n Home Team Total Goals: " + totHome + "\n Visitor Team Total Goals: " + totVisit;   
      
      if(totHome > totVisit)
         winStatus += "\n Winner: Home Team";      
      else if(totVisit > totHome)
         winStatus += "\n Winner: Visitor Team";
      else
         winStatus += "\n Tie";
      return winStatus;
   }

   public static void main(String [] args) {
      Random rand = new Random();
      @SuppressWarnings("deprecation")
         Date d1 = new Date(2018, 11, 12, 10, 12, 30);
      @SuppressWarnings("deprecation")
         Date d2 = new Date(2018, 11, 12, 12, 40, 30);
   
      SoccerMatch input = new SoccerMatch(d1, d2, "Lightning", "Thunder", "Hurricanes");
      String homePlayerName [] = {"Mark", "Sam", "Thomas", "Robert", "David", "Ryan", "Drew", "Mick", "Chris", "James", "John"};
      String visitPlayerName [] = {"Larry", "Will", "Tim", "Nathan", "Lucas", "Tyler", "Clay", "Jaden", "Kenneth", "Josh", "Michael"};
   
      for(int x = 0; x < 11; x++) {
         input.addHomePlayer(new Player(homePlayerName[x], rand.nextInt(10), "Thunder"));
         input.addVisitorPlayer(new Player(visitPlayerName[x], rand.nextInt(10), "Hurricanes"));
      }
   
      for(int x = 0; x < 10; x++) {      
         input.addHomeGoal(new Goal(rand.nextInt(59), input.homePlayers[x]));
         input.addVisitorGoal(new Goal(rand.nextInt(59), input.visitorPlayers[x]));
      }
      System.out.print("\n\n---------------- Home Team Players ---------------- ");
      
      for(int x = 0; x < 11; x++)
         System.out.println(input.homePlayers[x]);
      System.out.print("\n\n---------------- Visiting Team Players ---------------- ");
   
      for(int x = 0; x < 11; x++)
         System.out.println(input.visitorPlayers[x]);
      System.out.print("\n\n---------------- Home Team Goals ---------------- ");
   
      for(int x = 0; x < 10; x++)
         System.out.println(input.homeGoals[x]);
      System.out.print("\n\n---------------- Visiting Team Goals ---------------- ");
   
      for(int x = 0; x < 10; x++)
         System.out.println(input.visitorGoals[x]);
      System.out.print("\n\n---------------- GAME STATUS ---------------- ");
      System.out.println(input.getWinner());
   }
}