package lesson8.SpacePort;

public class RunSpace extends SpacePort{
    public static void main(String[] agrs) {
        SpaceShuttle shuttle1 = new SpaceShuttle();
        shuttle1.isLaunch(shuttle1);
    }
}
