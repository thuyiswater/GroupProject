package com.company;


public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\t\t\t\t\t Welcome to Record Management for Intelligent Tracking (RMIT)");
//        System.out.println("Menu: ");
//        System.out.printf("1. Add a new customer\n" +
//                "2. Update an existing customer\n" +
//                "3. Search for one customer\n" +
//                "4. Search for a list of customer\n");
//        System.out.printf("Please select an option by enter the number: ");


        ArrayList list = new ArrayList();

        list.add(new Customer("1", "1", "j", "2"));
        list.add(new Customer("1", "1", "k", "3"));
        list.add(new Customer("1", "1", "i", "1"));
        for(int i = 0; i < list.getSize(); i++){
            System.out.println(list.get(i));
        }

    }
}
