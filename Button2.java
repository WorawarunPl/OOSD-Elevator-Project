

public class Button2
{
    private Elevator elevator;
    private Controller controller;
    private int currentFloor;
    
    public void selectFloor(int f){
         currentFloor = f;
         //elevator.setCurrentFloor(currentFloor);
    }
    
    public int extend(){        
        return currentFloor;       
    }
    
    /*public void closeDoor(){
        
    }*/
    
}
