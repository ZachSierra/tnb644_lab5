package com.example.tnb644_lab5;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedFileReader extends BufferedReader {
    private String fileName;
    public BufferedFileReader(String fileName, Context c) throws IOException {
        super( new InputStreamReader(c.getAssets().open(fileName)));
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
