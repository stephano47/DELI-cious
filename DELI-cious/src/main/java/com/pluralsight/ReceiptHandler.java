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
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHH:mm:ss");
            String formattedDateTime = now.format(formatter);
            String fileName = formattedDateTime + ".txt";
            FileWriter writer = new FileWriter(fileName);
            writer.write("now");
            writer.close();

            System.out.println("Receipt Made!: " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// The Writer works however I must make sure it saves the file when the user hits yes on checkout
// I
