package MyPack1;

public class Working {
    public String name ="Vitaliy";
    private int number = 86001;
    protected int number_apartment=31;
    String job ="Accountant";

   public Working() {

    }

    public Working(String who){
        System.out.println("\nThe information for " + who+ ":");
    }

    public void shouInformation(){
        System.out.println("\nWorking's profile:");
        System.out.println("Name: " + name);
        System.out.println("Number: " + number);
        System.out.println("Apartment: " + number_apartment);
        System.out.println("Job:" +job);

    }
}
