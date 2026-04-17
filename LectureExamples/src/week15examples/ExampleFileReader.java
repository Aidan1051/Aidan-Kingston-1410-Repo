package week15examples;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ExampleFileReader {

    public static void createLog(FileWriter writer, File file) throws IOException {
        writer.write(file.getAbsolutePath() + System.lineSeparator());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                createLog(writer, f);
            }
        }
    }

    public static void createLogQueue(FileWriter writer, File file) throws IOException {
        writer.write(file.getAbsolutePath() + System.lineSeparator());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            Queue<File> queue = new LinkedList<File>(Arrays.asList(file.listFiles()));
            while (!queue.isEmpty()) {
                File thisFile = queue.poll();
                writer.write(thisFile.getAbsolutePath() + System.lineSeparator());
                if (thisFile.isDirectory()) {
                    queue.addAll(Arrays.asList(thisFile.listFiles()));
                }
            }
        }
    }



    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {e.printStackTrace();}

        JFileChooser chooseFile = new JFileChooser("");
        chooseFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooseFile.setDialogTitle("Choose your folder: ");
        int result = chooseFile.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {

            File chosenFile = chooseFile.getSelectedFile();


            try (FileWriter writer = new FileWriter("file-structure.log")) {
//                createLog(writer, chosenFile);
                createLogQueue(writer, chosenFile);


                System.out.println("file-structure.log has been created.");
            } catch(IOException e) {
                System.out.println("Unable to write to file-structure.log");
            }


        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("No file was selected. Program will terminate.");
        }
    }
}
