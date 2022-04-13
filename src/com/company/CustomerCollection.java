package com.company;

import java.util.Scanner;

public class CustomerCollection {
    Scanner sc = new Scanner(System.in);

    public Customer addCustomer(){
        System.out.printf("Enter customer's id: ");
        String id = sc.nextLine();
        System.out.printf("Enter customer's first name: ");
        String firstName = sc.nextLine();
        System.out.printf("Enter customer's last name: ");
        String lastName = sc.nextLine();
        System.out.printf("Enter customer's phone: ");
        String phone = sc.nextLine();
        Customer cus = new Customer(id, firstName, lastName, phone);
        if(!id.equals(cus.getID()) && id.length() == 10) {
            if(firstName.length() <= 20 && lastName.length() <= 20 && phone.length() >= 10 && phone.length() <= 20) {
            }
        } else System.out.println("invalid");

        return cus;
    }

    public void updateCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the customer's ID you want to update: ");
        String ID = sc.nextLine();

//        nếu id nhập vào == id trong DataFile gọi methode updateCustomer() trong ArrayList
//                nếu ko có id trùng return;
    }
}
