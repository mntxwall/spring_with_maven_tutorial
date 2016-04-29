package com.wei.test;

import java.util.List;

/**
 * Created by cw on 16-4-27.
 */
public class ReadService {
  private Reader reader = null;
  private String fileName = null;

  private List properties;

  public ReadService(Reader reader) {
    this.reader = reader;
  }

  public String fetchData() {
    return reader.read();
  }

  public void setFileName(String filename) {
    this.fileName = filename;
  }

  public void setProperties(List props) {
    properties = props;
  }

  public List getProperties() {
    return this.properties;
  }

  public String getFileName() {
    return fileName;
  }
}
