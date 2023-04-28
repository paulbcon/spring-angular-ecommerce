package com.paulnc.ecommerce.dto;

import com.paulnc.ecommerce.entity.Address;
import com.paulnc.ecommerce.entity.Customer;
import com.paulnc.ecommerce.entity.Order;
import com.paulnc.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
  private Customer customer;
  private Address shippingAddress;
  private Address billingAddress;
  private Order order;
  private Set<OrderItem> orderItems;

}
