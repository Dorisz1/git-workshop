public class Cheer {

    public void sayTeamName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cheer cheer = new Cheer();
        Cheer.sayTeamName("Group 7");
    }
}