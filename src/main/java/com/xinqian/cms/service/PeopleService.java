package com.xinqian.cms.service;

import java.util.List;

import com.xinqian.cms.domain.People;

public interface PeopleService {

	List<People> selectPeople();

	boolean addPeople(People people);

}
