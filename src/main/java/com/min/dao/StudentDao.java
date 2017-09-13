package com.min.dao;

import java.util.List;
import com.min.model.Student;
import com.min.model.User;

public interface StudentDao {
	void saveStudent(Student stu);

	User login(User user);

	List<User> getAllUser();
}
