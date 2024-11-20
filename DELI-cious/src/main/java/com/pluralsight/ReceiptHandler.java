package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class ReceiptHandler {

    public static void receiptWriter() {
        Sandwich sandwich = new Sandwich();
        try {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
            String formattedDateTime = now.format(formatter);
            String fileName = formattedDateTime + ".txt";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(sandwich.getBread() + sandwich.getSize() + sandwich.getTopping() +
                        sandwich.getPrmTopping());
            }

            System.out.println("Receipt Made!: " + fileName);
        } catch (IOException e) {
            System.out.println("Error occurred while creating the file.");
            e.printStackTrace();
        }
    }

}
// Current Issues:
// For some reason it always writes null0nullnull from each time the User inputs something
//Will have to make more packages
