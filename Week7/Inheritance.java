package Week7;

class Bicycle {
    int gear;
    int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
    

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

}
class MountainBike extends Bicycle {
    /*
     * the MountainBike subclass adds one more field *int seatHeight*. the
     * MountainBike subclass has one constructor *MountainBike(int gear,int speed,
     * int startHeight)* the MountainBike subclass adds one more method
     * *setHeight(int newValue)* to set the value of field seatHeight
     */

    int seatHeight;
    int startHeight;

    // Bicycle mountainBicycle;
     MountainBike(int gear, int speed, int startheight) {
      super(gear,speed);
    // this.startHeight = startHeight;
    // }
    public void setHeight(int newValue) {
        // this.newValue = newValue;
    }

}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Main Method");
        Bicycle joelBike = new Bicycle(2,3);
        joelBike
        
    }
    
}