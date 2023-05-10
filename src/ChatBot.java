import java.util.Scanner;
public class ChatBot {
    public static void main(String[] args) {
    greet();
    name();
    age();
    count();
    test();

        }
        public static void greet() {
        System.out.println("Hi, I am ChatBot. I am greeting you right now");
        }
    public static void name() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please reenter your name: ");
        String name1 = scanner.nextLine();

    }
    public static void age() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("When year were you born?");
        int birth = Integer.parseInt(scanner.nextLine());
        int age = 2023 - birth;
        System.out.println("I guess your age to be " + age);
    }
    public static void count() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number should I count to? ");
        int number = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }
    public static void test() {
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        System.out.println("Enter the letter corresponding to the correct answer to this question: ");
        System.out.println("What programming language was used to create the video game, Minecraft?");
        System.out.println("A: JavaScript");
        System.out.println("B: Java");
        System.out.println("C: C++");
        System.out.println("D: Python");
        while (x) {
            String response = scanner.nextLine();
            if (response.equals("B") || response.equals("b")) {
                x = false;
                System.out.println("That is correct. You are so smart!");
            }
        }
    }

    }
