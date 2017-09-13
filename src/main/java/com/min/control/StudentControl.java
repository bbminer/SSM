package com.min.control;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.min.model.Student;
import com.min.model.User;
import com.min.service.StudentService;

@Controller
public class StudentControl {
	@Autowired
	private StudentService stuService;

	@RequestMapping("/saveStudent.do")
	public String saveStudent(Student stu) {
		stuService.saveStudent(stu);
		return "success";
	}

	@RequestMapping("/login.do")
	public String login(User user, Map<String, List<User>> map) {
		if (stuService.login(user)) {
			map.put("allUser", stuService.getAllUser());
			return "student";
		}
		return "error";
	}
}
