package com.wei.test.config;

import com.wei.test.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cw on 16-5-9.
 */
@Configuration
public class CDPlayerConfig {
  /*@Bean(name="lonelyHearts")
  public CompactDisc sgtPeppers(){
    return new SgtPeppers();
  }*/

  @Bean(name="blankDisk")
  public CompactDisc blankDisk(){
    return new BlankDisk("YeHuiMei", "JayChou");
  }

  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc){
    return new CDPlayer(compactDisc);
  }
}
