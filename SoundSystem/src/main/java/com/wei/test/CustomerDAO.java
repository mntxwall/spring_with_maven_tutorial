package com.wei.test;
import com.wei.test.model.Customer;

/**
 * Created by cw on 16-5-10.
 */
public interface CustomerDAO {
  public void insert(Customer customer);
  public Customer findByCustomerId(int custId);
}
