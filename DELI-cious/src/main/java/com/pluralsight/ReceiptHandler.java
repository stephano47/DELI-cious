package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class ReceiptHandler {

    public static void receiptWriter(){
        try {

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
            String formattedDateTime = now.format(formatter);
            String fileName = formattedDateTime + ".txt";
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello");
            writer.close();

            System.out.println("File created: " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// The Writer works however I must make sure it saves the file when the user hits yes on checkout
// I
