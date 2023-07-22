package Class2;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("what is your name");

        String name= scanner.nextLine();
        System.out.println("what is your last name");

        String lastname= scanner.nextLine();

        System.out.println("your name is "+name+" your last name is "+lastname);

        System.out.println("please enter your age");

        int age= scanner.nextInt();
        System.out.println("your are eligible");

        if (age>20);
        System.out.println("you are eligible");

    }else{
        System.out.println("sorry");
    }
}
