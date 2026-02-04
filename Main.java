package buoi4;

public class Main {
    public static void main(String[]args){
        ServicePackage yoga = new ServicePackage("Yoga ", 3, 1000);
        ServicePackage gym = new ServicePackage("Gym ", 5, 2000);
        Member member= new Member("Trần Trung Hiếu", "0702349087");

        GymRegistration registration= new GymRegistration(member);
        registration.addPackage(yoga);
        registration.addPackage(gym);
        registration.printInfo();

    }
    
}
