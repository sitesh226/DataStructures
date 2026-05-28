package PropertiesReadWrite;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileTTLDeletion {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

    public static void main(String[] args) {

        String rootPath = "/tmp/files";

        deleteExpiredFiles(new File(rootPath));
    }

    public static void deleteExpiredFiles(File directory) {

        // Get all files/folders inside directory
        File[] files = directory.listFiles();

        if (files == null) {
            return;
        }

        for (File file : files) {

            // If nested directory -> recurse
            if (file.isDirectory()) {

                deleteExpiredFiles(file);

            } else {

                processFile(file);
            }
        }
    }

    private static void processFile(File file) {

        try {

            String fileName = file.getName();

            // Example:
            // report_20260518123000.txt

            String timestamp =
                    fileName.substring(
                            fileName.indexOf("_") + 1,
                            fileName.indexOf("."));

            LocalDateTime expiryTime =
                    LocalDateTime.parse(timestamp, FORMATTER);

            // Delete if expired
            if (LocalDateTime.now().isAfter(expiryTime)) {

                boolean deleted = file.delete();

                if (deleted) {
                    System.out.println("Deleted: " + file.getAbsolutePath());
                } else {
                    System.out.println("Could not delete: " + file.getAbsolutePath());
                }
            }

        } catch (Exception e) {

            // Invalid filename format etc.
            System.out.println("Skipping file: " + file.getName());
        }
    }
}