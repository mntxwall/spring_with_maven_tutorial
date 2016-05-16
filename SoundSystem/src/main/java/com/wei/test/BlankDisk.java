package com.wei.test;

import org.springframework.stereotype.Component;

/**
 * Created by cw on 16-5-16.
 */
@Component
public class BlankDisk implements CompactDisc {
  private String title = null;
  private String artist = null;

  public BlankDisk(String title, String artist) {
    this.title = title;
    this.artist = artist;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getartist() {
    return artist;
  }

  public void setartist(String artist) {
    this.artist = artist;
  }

  public void play() {
    System.out.println("Playing " + this.title + " by " + this.artist);
  }
}
