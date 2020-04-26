import com.epam.Aquarium;
import com.epam.Fish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium1 = new Aquarium();
        System.out.println("How many fish do you want in your aquarium?");
        Scanner sc = new Scanner(System.in);
        int numberOfFish = sc.nextInt();

        for (int i = 1; i<=numberOfFish; i++) {
            System.out.println("Fish number " + i);
            System.out.println("Type fish's name: ");
            Scanner sc1 = new Scanner(System.in);
            String fishName = sc1.nextLine();

            System.out.println("Type fish's age: ");
            Scanner sc2 = new Scanner(System.in);
            int fishAge = sc2.nextInt();

            System.out.println("Type fish's color: ");
            Scanner sc3 = new Scanner(System.in);
            String fishColor = sc3.nextLine();
            Fish fish2 = new Fish(fishName, fishAge, fishColor);
            aquarium1.addFish(fish2);
        }
        System.out.println("Your aquarium has the following fish: ");

        aquarium1.seeAllFishes();

    }
}
