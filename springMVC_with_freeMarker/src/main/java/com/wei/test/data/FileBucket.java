package com.wei.test.data;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by cw on 6/3/16.
 */
public class FileBucket {
    private MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
