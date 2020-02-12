package com.xinqian.cms.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.xinqian.cms.domain.People;
import com.xinqian.cms.service.PeopleService;

@Controller
public class MyController {
	@Autowired
	private PeopleService service;
	@RequestMapping("selectList")
	public Object select(Model m) {
		List<People> list=service.selectPeople();
		m.addAttribute("list", list);
		return "list";
	}
	@RequestMapping("toAdd")
	public Object toAdd() {
		return "add";
	}
	
	@RequestMapping("add")
	public Object add(MultipartFile myFile,People people,HttpServletRequest request,Model m) throws IllegalStateException, IOException {
		
		String url="E:/pic/image/20200112";
		String fileName = myFile.getOriginalFilename();
		String uuid = UUID.randomUUID().toString();
		File file = new File(url+"/"+uuid+fileName);
		myFile.transferTo(file);
		
		people.setUrl(uuid+fileName);
		System.out.println(people.getUrl());
//		System.out.println(fileName);
//		System.out.println(people);
		m.addAttribute("myfile",fileName);
		boolean result=service.addPeople(people);
		if (result) {
			request.setAttribute("msg","添加成功");
		}else {
			request.setAttribute("msg","添加失败");
		}
		return "add";
		
	}
}
