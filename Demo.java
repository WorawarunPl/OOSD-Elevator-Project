

public class Demo
{
    public static void test(){
        Button2 b2 = new Button2();
        Elevator e1 = new Elevator("Elevator 1",1000,5,true);
        Elevator e2 = new Elevator("Elevator 2",1000,5,true);
        Controller c = new Controller();
        
        //first p in 1 go 3
        Passenger p1 = new Passenger(45);
        Button1 lift1up = new Button1(1,"UP");               
              
        c.selectLift();
        System.out.println(e1.getID()+"'s current floor is on "+e1.getCurrentFloor()+" floor.");
        b2.selectFloor(3);
        System.out.println(e1.getID() + " is called from " + lift1up.sendFloor() +" floor.");
        System.out.print("Now, "+ e1.getID() + " is on " + lift1up.sendFloor() + " floor and ");
        c.print(lift1up,b2,e1); 
        System.out.println(e1.openDoor());
        System.out.println(e1.getID()+ " current floor is "+e1.getCurrentFloor()+" floor.");
        System.out.println(e1.closeDoor());
        System.out.println("-----------------------------");
        //second p in 6 go 2
        Passenger p2 = new Passenger(52);
        Button1 lift6down = new Button1(6,"DOWN");
        b2.selectFloor(2);
        c.selectLift();
        System.out.println(e2.getID()+"'s current floor is on "+e2.getCurrentFloor()+" floor.");
        System.out.println(e2.getID() + " is called from " + lift6down.sendFloor() +" floor.");
        System.out.print("Now, "+ e2.getID() + " is on " + lift6down.sendFloor() + " floor and ");       
        c.print(lift6down,b2,e2);
        System.out.println(e2.openDoor());
        System.out.println(e2.getID()+ " current floor is "+e2.getCurrentFloor()+" floor.");
        System.out.println(e2.closeDoor());
        System.out.println("-----------------------------");
        //third p in 8 go 1
        Passenger p3 = new Passenger(48);
        Button1 lift8down = new Button1(8,"DOWN");        
        b2.selectFloor(1);
        c.selectLift(); 
        System.out.println(e1.getID()+"'s current floor is on "+e1.getCurrentFloor()+" floor.");
        System.out.println(e1.getID() + " is called from " + lift8down.sendFloor() +" floor. ");
        System.out.print("Now, "+ e1.getID() + " is on " + lift8down.sendFloor() + " floor and ");       
        c.print(lift8down,b2,e1);
        System.out.println(e1.openDoor());
        System.out.println(e1.getID()+ " current floor is "+e1.getCurrentFloor()+" floor.");
        System.out.println(e1.closeDoor());
        System.out.println("-----------------------------");
    }
}
