package ikbo2519pr1;

public class DemoBall {
    public static void main(String[] args) {
        Ball a1=new Ball(71.5, "white");
        System.out.println(a1);
        a1.setColor("blue");
        a1.setVolume(100);
        System.out.println(a1);
    }
}
