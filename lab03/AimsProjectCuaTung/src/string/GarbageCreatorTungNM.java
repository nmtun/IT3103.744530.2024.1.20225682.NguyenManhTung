package string;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreatorTungNM {
   public static void main(String[] args) throws IOException {
        String filename = "D:/code/IT3103.744530.2024.1.20225682.NguyenManhTung/lab03/AimsProjectCuaTung/src/string/test.txt";
        byte[] inputBytes = {};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }  
}

