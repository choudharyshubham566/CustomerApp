package com.cust.service;

import com.cust.model.CustomerAddress;

public interface CustomerAddressService {

	CustomerAddress createAddress(CustomerAddress address);

	CustomerAddress getAddressById(Integer id);
}
