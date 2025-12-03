package org.example.functionalprogrammingjava8.shortProblems;

import java.io.IOException;
import java.io.InputStream;

@FunctionalInterface
public interface InputStreamOpener {

    InputStream open(String path) throws IOException;

}
