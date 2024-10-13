package pe.edu.utp.function;

import pe.edu.utp.util.ReadFile;

public class FileReaderManager {
    private ReadFile readFile = new ReadFile();
    private FileLogger fileLogger = new FileLogger();

    public FileData readFile(String path) {
        return new FileData("");
    }

    public void analyzeFile(FileData fileData) {

    }
}
