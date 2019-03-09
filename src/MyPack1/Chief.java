package MyPack1;

public class Chief extends Working {
    public Chief(){
        Working working = new Working("chief");
        System.out.println("Name: " + name);
        System.out.println("Apartment: " + number_apartment);
        System.out.println("Job: " + job);
    }
}
