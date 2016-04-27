package com.wei.test;

/**
 * Created by cw on 16-4-27.
 */
public class StringReader implements Reader {
    private String content = null;
    public StringReader(String content) {
        this.content = content;
    }
    public String read() {
        return content;
    }
}
