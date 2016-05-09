package com.wei.test;

import org.springframework.stereotype.Component;

/**
 * Created by cw on 16-5-9.
 */
@Component
public class CDPlayer {
  private CompactDisc cd;
  public CDPlayer(CompactDisc cd){
    this.cd = cd;
  }
  public void play(){
    cd.play();
  }
}
