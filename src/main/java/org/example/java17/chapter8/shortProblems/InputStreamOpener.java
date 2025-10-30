package org.example.java17.chapter8.shortProblems;

import java.io.IOException;
import java.io.InputStream;

@FunctionalInterface
public interface InputStreamOpener {

    InputStream open(String path) throws IOException;

}
