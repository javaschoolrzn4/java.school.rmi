package ru.rzn.sbt.rmi;

import ru.rzn.sbt.rmi.rmifilereader.FileReaderImpl;

import java.rmi.RemoteException;

public class MyClass {
    public static void main(String[] args) throws RemoteException {
        FileReaderImpl filereader = new FileReaderImpl();
        filereader.openFile("pom.xml");
    }
}
