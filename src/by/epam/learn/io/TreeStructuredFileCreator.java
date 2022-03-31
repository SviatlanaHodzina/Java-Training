package by.epam.learn.io;

import java.io.File;
import java.util.Objects;

public class TreeStructuredFileCreator {

    public static String getTreeStructuredFileList(File[] list, int level) {
        StringBuilder output = new StringBuilder();
        for (File file : list) {
            if (file.isFile()) {
                output.append("\t".repeat(Math.max(0, level - 1)));
                output.append("|   *").append(file.toPath().getFileName()).append("\n");
            } else if (file.isDirectory()) {
                output.append("\t".repeat(Math.max(0, level)));
                output.append("|---").append(file.toPath().getFileName()).append("|").append("\n")
                        .append(getTreeStructuredFileList(Objects.requireNonNull(file.listFiles()), level + 1));
            }
        }
        return output.toString();
    }
}
