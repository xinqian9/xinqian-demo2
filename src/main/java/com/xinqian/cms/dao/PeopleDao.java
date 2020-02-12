package com.xinqian.cms.dao;

import java.util.List;

import com.xinqian.cms.domain.People;

public interface PeopleDao {

	List<People> selectPeople();

	int addPeople(People people);

}
