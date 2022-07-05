package com.fasttrack.files;

import java.io.*;
import java.util.Scanner;

public class ReadingFromFiles {
    public static void main(String[] args) throws IOException {
        readOneLine();
        readFullFile();
        readFileBuffered();
    }

    public static void readFileBuffered() throws IOException {
        System.out.println("Buffered read:");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("files/content.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public static void readFullFile() throws FileNotFoundException {
        System.out.println("---- Reading whole file:");
        Scanner scanner = new Scanner(new File("files", "content.txt"));
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }

    public static void readOneLine() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("files", "content.txt"));

        String line = scanner.nextLine();
        System.out.println(line);
    }
}
