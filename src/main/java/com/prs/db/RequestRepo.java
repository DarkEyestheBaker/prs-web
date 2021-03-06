package com.prs.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prs.business.Request;
import com.prs.business.User;


public interface RequestRepo extends JpaRepository<Request, Integer> {

	List<Request> findAllById(int id);
	List<Request>findByStatusAndUserNot(String status, User user);

}
