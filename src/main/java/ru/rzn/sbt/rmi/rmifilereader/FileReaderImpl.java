package ru.rzn.sbt.rmi.rmifilereader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.rmi.RemoteException;

public class FileReaderImpl implements IFileReader {

    public void main(String[] args) throws RemoteException {
        this.openFile("pom.xml");
    }

    @Override
    public boolean openFile(String filename) throws RemoteException {
        try {
            Files.lines(Paths.get(filename)).forEach(str -> System.out.println(str));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String nextLine() throws RemoteException {
        return null;
    }

    @Override
    public boolean closeFile() throws RemoteException {
        return false;
    }
}
