package com.flowpractice.security.controller;

import java.util.List;

import com.flowpractice.security.model.entity.Notice;
import com.flowpractice.security.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NoticesController {
	
	@Autowired
	private NoticeRepository noticeRepository;
	
	@GetMapping("/notices")
	public List<Notice> getNotices() {
		List<Notice> notices = (List<Notice>) noticeRepository.findAll();
		System.out.println("---> Notices CONTROLLER: Notices LIST --->" +notices);
		if (notices != null ) {
			return notices;
		}else {
			return null;
		}
	}

}
