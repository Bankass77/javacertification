package org.example.java17.chapter8.shortProblems;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;


public class Solution {

    public static void main(String[] args) throws IOException {

        InputStreamOpener dataOpener = new InputStreamOpener() {
            @Override
            public InputStream open(final String path) throws FileNotFoundException {
                return new DataInputStream(new FileInputStream(path));
            }
        };

        InputStreamOpener objectOpener = new InputStreamOpener() {
            @Override
            public InputStream open(final String path) throws IOException {
                return new ObjectInputStream(new FileInputStream(path));
            }
        };

        InputStreamOpener dataBufferedOpener = new InputStreamOpener() {
            @Override
            public InputStream open(final String path) throws IOException {
                return new BufferedInputStream(new FileInputStream(path));
            }
        };

        Path file = Paths.get(System.getProperty("user.home"), "Téléchargements", "entretien.docx");

        System.out.println("-----------------BufferedInputStream-------------------------");
        try (InputStream in = dataBufferedOpener.open(file.toString())) {
            byte[] buffer = new byte[10];
            int bytesRead = in.read(buffer);
            System.out.println("Lecture de " + bytesRead + " octets : " + Arrays.toString(buffer));
        }

        System.out.println("------------------DataInputStream------------------------");
        try (InputStream in = dataOpener.open(file.toString())) {
            byte[] buffer = new byte[10];
            int bytesRead = in.read(buffer);
            System.out.println("Lecture de " + bytesRead + " octets : " + Arrays.toString(buffer));
        }

        System.out.println("-----------------ObjectInputStream-------------------------");
        try (InputStream in = objectOpener.open(file.toString())) {
            System.out.println("Ouverture réussie avec ObjectInputStream : " + in.getClass().getSimpleName());
            in.read();
        } catch (StreamCorruptedException e) {
            System.out.println("⚠️ Fichier non compatible avec ObjectInputStream : " + e.getMessage());
        }
    }
}

