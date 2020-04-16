package lesson8.SpacePort;

public class SpacePort{


    public void  isLaunch(ISpace cosmos){
        if(cosmos.preLaunchSystemCheck()==true){
            cosmos.startEngine();
            for(int i=10;i>0;i--){
                System.out.println(i);
            }
            cosmos.isStart();
        }else{
            System.out.println("Предстартовая проверка провалена");
        }
    }
}
