

public class Passenger
{
    private int weight;
    private Controller c;
    
    Passenger(int weight){
        this.weight = weight;
    }
    
    public void callElevator(Button1 b){
       b.sendFloor();
    }
    
}
