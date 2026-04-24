package logger;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class FileLogger {

    public static void main(String[] args) {

        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("PA8-JFileChooser-Popup");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        int result = chooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            createLog(selectedFile);
        }
    }

    public static void createLog(File file) {

        ArrayList<String> paths = new ArrayList<>();

        try {
            if (file == null || !file.exists()) {
                System.out.println("Invalid selection.");
                return;
            }

            // collect paths
            if (file.isFile()) {
                paths.add(file.getAbsolutePath());
            } else if (file.isDirectory()) {
                scanFolder(file, paths);
            }

            // ✅ FIX: choose correct output directory
            File outputDir;

            if (file.isDirectory()) {
                outputDir = file;
            } else {
                outputDir = file.getParentFile();
            }

            File logFile = new File(outputDir, "file-structure.log");

            BufferedWriter writer = new BufferedWriter(new FileWriter(logFile));

            for (String path : paths) {
                writer.write(path);
                writer.newLine();
            }

            writer.close();

            System.out.println("Log created at: " + logFile.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Error writing log file: " + e.getMessage());
        }
    }

    private static void scanFolder(File folder, ArrayList<String> paths) {

        paths.add(folder.getAbsolutePath());

        File[] files = folder.listFiles();

        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    paths.add(f.getAbsolutePath());
                } else if (f.isDirectory()) {
                    scanFolder(f, paths);
                }
            }
        }
    }
}