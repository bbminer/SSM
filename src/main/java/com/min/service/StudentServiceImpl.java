package com.min.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.dao.StudentDao;
import com.min.model.Student;
import com.min.model.User;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao stuDao;

	public void saveStudent(Student stu) {
		// TODO Auto-generated method stub
		stuDao.saveStudent(stu);
	}

	public boolean login(User user) {
		// TODO Auto-generated method stub
		if (stuDao.login(user) != null) {
			return true;
		}
		return false;
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return stuDao.getAllUser();
	}

}
