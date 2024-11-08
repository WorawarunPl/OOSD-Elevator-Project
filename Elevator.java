

public class Elevator
{
    private String ID;
    private int maxLoad;
    public int currentFloor;
    private String direction;
    public boolean status;
    private Controller cont;
    Button2 b2 = new Button2();
    //private int[] passengerList;
    public Elevator(String id,int mL, int cF,boolean check){       
        ID = id;
        maxLoad = mL;
        currentFloor = cF;
        status = check;
        
    }
    public Elevator(){
    
    }
    public String getID(){
        return ID;
    }
    /*public int newCurrentFloor(Button2 b2){        
        currentFloor = b2.extend();
        return currentFloor;
    }*/
    public int getCurrentFloor(){ 
        
        if(b2.extend() == 0){
            return currentFloor;
        }else{
            currentFloor = b2.extend();
            return currentFloor;
        }
        
        
    }
    public String openDoor(){        
        return "Elevator Door is Open.";
    }
    
    public String closeDoor(){
        return "Elevator Door is Close.";
    }
    
    public String goUp(){       
        return "is going up to ";
    }
    
    public String goDown(){
        return "is going down to ";
    }
    
    
}
