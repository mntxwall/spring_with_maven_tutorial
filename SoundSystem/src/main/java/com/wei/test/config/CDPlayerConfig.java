package com.wei.test.config;

import com.wei.test.CDPlayer;
import com.wei.test.CompactDisc;
import com.wei.test.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cw on 16-5-9.
 */
@Configuration
public class CDPlayerConfig {
  @Bean(name="lonelyHearts")
  public CompactDisc sgtPeppers(){
    return new SgtPeppers();
  }

  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc){
    return new CDPlayer(compactDisc);
  }
}
