package com.wei.test;

import org.springframework.stereotype.Component;

/**
 * Created by cw on 16-5-16.
 */
@Component
public class JayChou implements CompactDisc {

  private String title = "YeHuiMei";
  private String artist = "Jay";
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }
}
