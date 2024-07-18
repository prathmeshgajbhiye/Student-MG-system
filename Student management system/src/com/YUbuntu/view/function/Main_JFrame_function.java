package com.YUbuntu.view.function;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * 
 * @Project Student management system
 * @Package com.YUbuntu.view.function
 * @Description Extract the function panel into the interface.
 * @Author #YUbuntu
 * @Date Dec 28, 2018-3:52:22 PM
 * @version 1.0
 */
public interface Main_JFrame_function
{
	
	/**
	 * 
	 * @Title Interface 
	 * @Description Course selection management.
	 * @param ActionEvent e
	 * @return void
	 * @date Jan 17, 2019-4:03:40 PM
	 *
	 */
	void Interface_ChooseCourseManagement(ActionEvent e);
	
	/**
	 * 
	 * @Title Interface
	 * @Description Manage the course information.
	 * @param Performed action
	 * @return void
	 * @date Jan 15, 2019-2:29:49 PM
	 *
	 */
	void Interface_CourseListManagement(ActionEvent e);
	
	/**
	 * 
	 * @Title Interface
	 * @Description Add a new course.
	 * @param Performed action
	 * @return void
	 * @date Dec 29, 2018-7:20:39 PM
	 * @version 2.0
	 * @throws no
	 *
	 */
	void Interface_AddCourse(ActionEvent e);
	
	/**
	 * 
	 * @Title Interface
	 * @Description manage the teacher information.
	 * @param Performed action
	 * @return void
	 * @date Dec 28, 2018-3:55:52 PM
	 * @throws no
	 *
	 */
	void Interface_TeacherListManagement(ActionEvent e);
	
	/**
	 * 
	 * @Title Interface
	 * @Description Add a new teacher.
	 * @param Performed action
	 * @return void
	 * @date Dec 28, 2018-4:00:25 PM
	 * @throws no
	 *
	 */
	void Interface_AddTeacher(ActionEvent e);
	
	/**
	 * 
	 * @Title Interface
	 * @Description manage the student inforamtion.
	 * @param Performed action
	 * @return void
	 * @date Dec 28, 2018-4:01:52 PM
	 * @throws ..
	 *
	 */
	void Interface_StudentListManagement(ActionEvent e);
	
	/**
	 * 
	 * @Title Interface
	 * @Description add a new student.
	 * @param Performed action
	 * @return void
	 * @date Dec 28, 2018-4:04:12 PM
	 * @throws ..
	 *
	 */
	void Interface_AddStudent(ActionEvent e);
	
	/**
	 * 
	 * @Title Interface
	 * @Description manage the class information.
	 * @param Performed action
	 * @return void
	 * @date Dec 28, 2018-4:05:42 PM
	 * @throws ..
	 *
	 */
	void Interface_ClassManagement(ActionEvent e);
	
	/**
	 * 
	 * @Title Interface
	 * @Description Add a new class.
	 * @param Performed action
	 * @return void
	 * @date Dec 28, 2018-4:09:09 PM
	 * @throws ..
	 *
	 */
	void Interface_AddClass(ActionEvent e);
	
	/**
	 * 
	 * @Title Interface
	 * @Description Exit the system
	 * @param Performed action
	 * @return void
	 * @date Dec 28, 2018-4:10:27 PM
	 * @throws ..
	 *
	 */
	void Interface_Login_Out(ActionEvent e);
	
	/**
	 * 
	 * @Title Interface
	 * @Description Modify the user password.
	 * @param Performed action
	 * @return void
	 * @date Dec 28, 2018-4:11:23 PM
	 * @throws ..
	 *
	 */
	void Interface_ChangePassword(ActionEvent e);
	
	/**
	 * 
	 * @Title Interface
	 * @Description The information about me ~
	 * @param Performed action
	 * @return void
	 * @date Dec 28, 2018-4:12:27 PM
	 * @throws URISyntaxException 
	 * @throws IOException 
	 *
	 */
	void About_YUbuntu(ActionEvent e) throws IOException, URISyntaxException;
	
	/**
	 * 
	 * @Title Interface
	 * @Description Set user permissions.
	 * @param Performed action
	 * @return void
	 * @date Dec 28, 2018-4:14:54 PM
	 * @throws ..
	 *
	 */
	void Initialize_SetUserPermissions();
	
}
