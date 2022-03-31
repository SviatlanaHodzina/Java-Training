package by.epam.learn.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// @param folderPath - the path of the directory to start in (/src)
// @param filePath - the path of the regular file to start (/folderInfo.txt)
public class CountFilesClass {

    //  method counts average file name length in the current directory /src
    public static int countAverageFileNameLength(String folderPath) throws IOException {
        int sumLengthOfFileName = 0;
        List<Path> list;
        Path path = Paths.get(folderPath);
        try (Stream<Path> walk = Files.walk(path)) {
            list = walk.filter(Files::isRegularFile)
                    .collect(Collectors.toList());
            for (Path file : list) {
                int filenameLength = file.getFileName().toString().length();
                sumLengthOfFileName = sumLengthOfFileName + filenameLength;
            }
            return sumLengthOfFileName / countTotalFilesInDirectory(folderPath);
        }
    }

    //  method counts files in the current directory /src (depth 1)
    public static int countFilesInDirectory(String folderPath) throws IOException {
        int countFiles;
        Path path = Paths.get(folderPath);
        try (Stream<Path> walk = Files.walk(path, 1)) {
            countFiles = (int) walk.filter(Files::isRegularFile)
                    .count();
        }
        return countFiles;
    }

    //  method counts total number of files in the current directory /src, including SubDirectories
    public static int countTotalFilesInDirectory(String folderPath) throws IOException {
        int countTotalFilesInDirectory;
        Path path = Paths.get(folderPath);
        try (Stream<Path> walk = Files.walk(path)) {
            countTotalFilesInDirectory = (int) walk.filter(Files::isRegularFile)
                    .count();
        }
        return countTotalFilesInDirectory;
    }

    //  method counts total number of subdirectories in the current directory /src
    public static int countSubDirectories(String folderPath) throws IOException {
        int countSubDirectory;
        Path path = Paths.get(folderPath);
        try (Stream<Path> walk = Files.walk(path)) {
            countSubDirectory = (int) walk.filter(Files::isDirectory)
                    .count() - 1;
        }
        return countSubDirectory;
    }

    /**
     *  Method counts/reads from the Tree structured file FolderInfo.txt:
     *          - total number of files in the directory /src - with the value of String fileSign = "*";
     *          - total number of subdirectories in the directory /src  - with the value of String fileSign = "|---"
     */
    public static int countFilesInTreeFile(String filePath, String fileCounterSign) throws IOException {
        int filesInReadFileCount = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                if (fileLine.contains(fileCounterSign)) {
                    filesInReadFileCount++;
                }
            }
            return filesInReadFileCount;
        }
    }
}