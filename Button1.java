

public class Button1
{
    private int floor;
    private String direction;
    private Controller controller;
    
    Button1(int floor ,String direction){
        this.floor = floor;
        this.direction = direction;
    }
    Button1(){
        
    }
    
    public void setController(Controller c){
        controller = c;
    }
    
    public int sendFloor(){
        return floor;
    }
    
    public String getDirection(){
        return direction;
    }
}
