package com.wei.test;
import org.springframework.stereotype.Component;
/**
 * Created by cw on 16-5-9.
 */
@Component
public class SgtPeppers implements CompactDisc {
  private String title = "Sgt. Pepper's Lonely Hearts Club Band";
  private String artist = "The Beatles";
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }
}
