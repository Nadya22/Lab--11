package MyPack2;

import MyPack1.Working;
public class Employees extends Working {

    public Employees(){
        Working working = new Working("Employees");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + number_apartment);
    }
}
