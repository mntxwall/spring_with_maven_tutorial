package com.wei.test.data;

import com.wei.test.Spittle;

import java.util.List;

/**
 * Created by cw on 5/27/16.
 */
public interface SpittleRepository {
  List<Spittle> findSpittles(long max, int count);
}
