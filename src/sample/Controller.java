package sample;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.*;
import java.util.Scanner;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class Controller {
    public Button button;
    public TextArea txt2;


    String asd;

    public Controller() throws FileNotFoundException {
    }

    public void handleButtonClick() throws IOException {
        txt2.clear();
        FileWriter myWriter = new FileWriter("filename.txt");


        for (int i = 0; i < 10; i++) {
            String result = RandomStringUtils.randomAscii(12);
            txt2.appendText(result + "\n");
            myWriter.write(result + "\n");
        }
        myWriter.close();
    }
    public void handleButtonClick2() throws FileNotFoundException {
        txt2.clear();
        File file = new File("filename.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null)
                txt2.appendText(st + "\n");
        } catch (IOException e) {
            PrintWriter writer = new PrintWriter(file);
            String asd=("empty file :c");
            writer.print(asd);
            txt2.appendText(asd);
            writer.close();
        }

    }
    public void handleButtonClick3() throws IOException {
        txt2.clear();
        File file = new File("filename.txt");
        PrintWriter writer = new PrintWriter(file);
        writer.print("empty file :c");
        writer.close();
    }

}
