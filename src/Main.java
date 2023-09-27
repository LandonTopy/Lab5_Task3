import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String party;

        System.out.println("What is your party affiliation? (D, R, I)");
        party = scan.next();
        if (party.equals("D")) {
            System.out.println("You get a Democratic Donkey");
        }else if (party.equals("R")) {
            System.out.println("You get a Republican Elephant");
        } else if (party.equals("I")) {
            System.out.println("You get an Independent Person");
        } else
            System.out.println("Your party is other");
        }
    }