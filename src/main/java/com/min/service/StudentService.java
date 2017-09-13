package com.min.service;

import java.util.List;
import com.min.model.Student;
import com.min.model.User;

public interface StudentService {
	void saveStudent(Student stu);
	boolean login(User user);
	List<User> getAllUser();
}
