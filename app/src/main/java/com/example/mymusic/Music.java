package com.example.mymusic;

import android.net.Uri;

import java.io.File;

public class Music extends File {

    private final Uri uri;
    private final String title;


    public Music(Uri uri, String title) {
        super(uri.toString());
        this.uri = uri;
        this.title = title;
    }
    public Uri getUri() {
        return uri;
    }
    public String getTitle() {
        return title;
    }
}

