package com.wei.test.aop;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cw on 16-5-20.
 */
public class TrackCounter {
  private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();
  public void countTrack(int trackNumber){
    int currentCount = getPlayCount(trackNumber);
    trackCounts.put(trackNumber, currentCount + 1);

    System.out.println(String.format("TrackNumber is %d", trackNumber));
  }
  public int getPlayCount(int trackNumber){
    return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
  }
}
