package com.fasttrack.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt"));
        writer.write("This is my first output file");
        writer.newLine();
        writer.write("This is my first output file");
        writer.newLine();
        writer.write("This is my first output file");
        writer.newLine();
        writer.write("This is my first output file");
        writer.flush();
    }
}
