import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        String fileName;
        String tempFileName;
        Scanner scnr = new Scanner(System.in);

        fileName = scnr.nextLine();
        tempFileName = "image" + fileName;

        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
            bw = new BufferedWriter(new FileWriter(tempFileName));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("_photo.jpg")) {
                    line = line.replace("_photo.jpg", "_info.txt");
                }
                bw.write(line+"\n");

                System.out.println(line);
            }
        }
        catch (Exception e) {
            return;
        }
        finally {
            try {
                if(br != null)
                    br.close();
            }
            catch (IOException e) {
            }
            try {
                if(bw != null)
                    bw.close();
            }
            catch (IOException e) {
            }
        }

        File oldFile = new File(fileName);
        oldFile.delete();

        File newFile = new File(tempFileName);
        newFile.renameTo(oldFile);
    }
}