package com.wei.test.bean.impl;

import com.wei.test.bean.CompactDisc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cw on 16-5-20.
 */
public class BlankDisc implements CompactDisc {
  private String title = null;
  private String artist = null;
  private List<String> tracks = null;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public List<String> getTracks() {
    return tracks;
  }

  public void setTracks(ArrayList<String> tracks) {
    this.tracks = tracks;
  }

  public void playTrack(int trackIndex) {

    System.out.println(String.format("You are listening %s", tracks.get(trackIndex)));

  }
}
