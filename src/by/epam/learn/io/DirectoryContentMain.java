package by.epam.learn.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

import static by.epam.learn.io.CountFilesClass.*;
import static by.epam.learn.io.TreeStructuredFileCreator.getTreeStructuredFileList;
import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Method countFilesInTreeFile(filePath, fileSign) counts/reads from the Tree structured file FolderInfo.txt:
 * - total number of files in the directory /src - with the value of fileCounter;
 * - total number of subdirectories in the directory /src  - with the value of folderCounter
 */

public class DirectoryContentMain {
    public static void main(String[] args) throws IOException {
// change 19 March 2022 - this string is added for creating new file
        FileWriter writer = new FileWriter("./src/FolderInfo.txt");

        StringBuilder infoOutput = new StringBuilder();

        String filePath = "./src/FolderInfo.txt";
        String filePathGot = new File(filePath).getPath();
        String folderPath = ".";
        String info = "The currect Folder's content is written down in the Tree structured File " +
                "FolderInfo.txt and looks like below: " + "\n";
        String fileCounter = "*";
        String folderCounter = "|---";
        int averageNumberOfFilesInDirectInTreeFile =
                countFilesInTreeFile(filePath, fileCounter) / (countFilesInTreeFile(filePath, folderCounter) + 1);

        if (new File(folderPath).exists() && new File(folderPath).isDirectory()) {
            File[] list = new File(folderPath).listFiles();
            String outputFolder = getTreeStructuredFileList(Objects.requireNonNull(list), 0);
            //  total number of  file items (files and subdirectories) in the current directory /src (depth 1)
            int countFileItemsInDirectory = Objects.requireNonNull(new File(folderPath).list()).length;

            StringBuilder directorySumInfo = infoOutput.append("\n /src Directory's summarizing info: \n\t\t")
                    .append("Current Directory FolderInfo.txt contains: \n")
                    .append(countFileItemsInDirectory).append(" items, including: ").append("\n")
                    .append(countFilesInDirectory(folderPath)).append(" regular files and").append("\n")
                    .append(countSubDirectories(folderPath)).append(" SubDirectories;  \n")
                    .append(countTotalFilesInDirectory((folderPath)))
                    .append(" - Total regular files in the Directory").append("\n")
                    .append(countAverageFileNameLength(folderPath))
                    .append(" - Average file name length in the Directory").append("\n")
                    .append(averageNumberOfFilesInDirectInTreeFile).append(" - Average number of Files;");

            try (FileWriter fileOutput = new FileWriter(filePathGot, UTF_8, false)) {
                fileOutput.write(info + outputFolder);
                fileOutput.write(String.valueOf(directorySumInfo));
                fileOutput.flush();
            }

            if (new File(filePath).exists() && new File(filePath).isFile()) {
                System.out.println("\n /src Directory's Summarizing Info read in the current " +
                        "tree structured file FolderInfo.txt: \n\n" +
                        countFilesInTreeFile(filePath, fileCounter) + " - Total number of files; " + "\n");
                System.out.println(countFilesInTreeFile(filePath, folderCounter) + " - Total number of SubDirectories;" + "\n");
                System.out.println(averageNumberOfFilesInDirectInTreeFile + " - Average number of Files;" + "\n");
                System.out.println(countAverageFileNameLength(folderPath) + " - Average filename's Length");
            }
        }
    }
}
