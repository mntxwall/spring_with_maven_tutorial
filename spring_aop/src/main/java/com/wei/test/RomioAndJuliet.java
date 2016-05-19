package com.wei.test;

import org.springframework.stereotype.Component;

/**
 * Created by cw on 16-5-19.
 */
@Component
public class RomioAndJuliet implements Performance {
  public void perform() {
    System.out.println("RomioAndJuliet");
  }
}
