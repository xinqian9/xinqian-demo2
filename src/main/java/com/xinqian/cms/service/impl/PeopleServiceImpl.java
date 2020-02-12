package com.xinqian.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xinqian.cms.dao.PeopleDao;
import com.xinqian.cms.domain.People;
import com.xinqian.cms.service.PeopleService;

@Service("service")
public class PeopleServiceImpl implements PeopleService{
	@Autowired
	private PeopleDao dao;

	@Override
	public List<People> selectPeople() {
		// TODO Auto-generated method stub
		return dao.selectPeople();
	}

	@Override
	public boolean addPeople(People people) {
		// TODO Auto-generated method stub
		return dao.addPeople(people)>0;
	}
}
