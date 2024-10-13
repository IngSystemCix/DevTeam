package pe.edu.utp.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Utility class for reading files.
 * @Author: Juan Bladimir Romero Collazos
 */
public class ReadFile {

    private static final Logger LOGGER = Logger.getLogger(ReadFile.class.getName());

    /**
     * Reads a file line by line and prints each line to the console.
     *
     * @param path the path to the file to be read
     */
    public void read(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            LOGGER.severe("Error reading file: " + e.getMessage());
        }
    }

    /**
     * Reads the entire content of a file and returns it as a single string.
     *
     * @param path the path to the file to be read
     * @return the content of the file as a string, or null if an error occurs
     */
    public String readAllAsString(String path) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            LOGGER.severe("Error reading file: " + e.getMessage());
            return null;
        }
        return content.toString();
    }

    /**
     * Reads the entire content of a file and returns it as a list of strings,
     * where each string is a line from the file.
     *
     * @param path the path to the file to be read
     * @return a list of strings, each representing a line from the file
     */
    public List<String> readAllAsList(String path) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            LOGGER.severe("Error reading file: " + e.getMessage());
        }
        return lines;
    }

    /**
     * Reads a specific line from a file.
     *
     * @param path the path to the file to be read
     * @param lineNumber the line number to be read (1-based index)
     * @return the content of the specified line, or null if an error occurs or the line does not exist
     */
    public String readLineByNumber(String path, int lineNumber) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            int currentLine = 0;
            while ((line = br.readLine()) != null) {
                currentLine++;
                if (currentLine == lineNumber) {
                    return line;
                }
            }
        } catch (IOException e) {
            LOGGER.severe("Error reading file: " + e.getMessage());
        }
        return null;
    }

    /**
     * Counts the number of lines in a file.
     *
     * @param path the path to the file to be read
     * @return the number of lines in the file, or -1 if an error occurs
     */
    public int countLines(String path) {
        try {
            return (int) Files.lines(Path.of(path)).count();
        } catch (IOException e) {
            LOGGER.severe("Error counting lines: " + e.getMessage());
            return -1;
        }
    }

    /**
     * Reads a file and splits each line by a specified delimiter, returning the parts as a list of strings.
     *
     * @param path the path to the file to be read
     * @param delimiter the delimiter to split each line by
     * @return a list of strings containing the parts of each line split by the delimiter
     */
    public List<String> readWithDelimiter(String path, String delimiter) {
        List<String> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(delimiter);
                for (String part : parts) {
                    result.add(part);
                }
            }
        } catch (IOException e) {
            LOGGER.severe("Error reading file: " + e.getMessage());
        }
        return result;
    }
}