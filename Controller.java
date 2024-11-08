public class Controller
{
   private int size;
   Button1 b1 = new Button1();
   Button2 b2 = new Button2();
   Elevator e1 = new Elevator("Elevator 1",1000,5,true);
   Elevator e2 = new Elevator("Elevator 2",1000,5,true);
   
    Controller(){        
        
   }
   
    public void selectLift(){
        int sum1 = b1.sendFloor() - e1.getCurrentFloor();
        int sum2 = b1.sendFloor() - e2.getCurrentFloor();
        System.out.println(sum2);
        if(b1.sendFloor() - b2.extend() < 0){
            if(sum1==sum2){
                System.out.println("Elevator 1 is ready.");
            }
            else if(sum1>sum2){
                System.out.println("Elevator 1 is ready.");
            }else{
                System.out.println("Elevator 2 is ready.");
            }
           
            
        }else if(b1.sendFloor() - b2.extend() > 0){
            if(sum1==sum2){
                System.out.println("Elevator 1 is ready.");
            }
            else if(sum1<sum2){
                System.out.println("Elevator 1 is ready.");
            }else{
                System.out.println("Elevator 2 is ready.");
            }
        }
        
        /*if(ev.status == true){
            System.out.println("Elevator 1 is ready.");
            //ev.status = false;
        }else{
            System.out.println("Elevator 2 is ready.");
            //ev.status = true;
        }*/
    }
    
    public void print(Button1 b1, Button2 b2,Elevator ev){
        if(b1.sendFloor() - b2.extend() < 0){
            System.out.println(ev.goUp() + b2.extend()+" floor.");
            ev.status = false;
        }else{
            System.out.println(ev.goDown()+ b2.extend()+" floor.");
            ev.status = true;
        }
        
    }
}