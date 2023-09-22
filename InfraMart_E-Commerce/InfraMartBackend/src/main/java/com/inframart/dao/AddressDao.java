package com.inframart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inframart.model.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer> {

}
