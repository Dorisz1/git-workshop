public class Cheer {
 public void sayTeamName(String name) {
        System.out.println("Cheer for the" + name);

    }

    public static void main(String[] args) {
        Cheer cheer = new Cheer();
        Cheer.sayTeamName("Group7");
    }
}