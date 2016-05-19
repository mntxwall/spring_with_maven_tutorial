package com.wei.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by cw on 16-5-19.
 */
@Configuration
@EnableAspectJAutoProxy
public class ShowConfig {
  @Bean(name = "romioandjuliet")
  public Performance romioandjuliet(){
    return new RomioAndJuliet();
  }
  @Bean
  public Audience audience(){
    return new Audience();
  }

}
