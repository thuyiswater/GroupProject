package com.company;

import java.io.*;
import java.net.URL;

public class DataHandler {

    public void read() throws Exception {
        URL url = new URL("https://raw.githubusercontent.com/TriDang/cosc2658-2022-s1/main/Project/customers.csv");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }

    public void write(Customer customer) {
        try{
            FileWriter writer = new FileWriter("D:\\IntellJ\\IdeaProjects\\GroupProject\\src\\com\\company\\UserFile.txt", true);
            writer.write("\n");
            writer.write(customer.getID());
            writer.write(", ");
            writer.write(customer.getFirstName());
            writer.write(customer.getLastName());
            writer.close();
        } catch (IOException e){
            System.out.println("Error write file");
        }
    }
}
