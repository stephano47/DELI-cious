package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class ReceiptHandler {

    public static void receiptWriter(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
            writer.write("");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
