public class Cheer {

    public void sayTeamName(String teamName) {
        System.out.println( teamName);
    }

    public static void main(String[] args) {
        Cheer cheer = new Cheer();
        Cheer.sayTeamName("Team 7");
    }
}