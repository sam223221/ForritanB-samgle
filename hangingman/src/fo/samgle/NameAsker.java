package fo.samgle;

import java.util.Scanner;

public class NameAsker {
    public String WhatIsYourName() {
        System.out.println("Hvussu eita tygum?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }
}