package com.company;

import java.util.Scanner;

public class Controller {
    public void addCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter new customer ID: ");
        String id = sc.nextLine();
        System.out.println(id);
    }
}
