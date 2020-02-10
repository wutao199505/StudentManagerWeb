package com.ischoolbar.programmer.model;
/**
 * 
 * @author llq
 *选择健身项目表实体
 */
public class SelectedCourse {
	private int id;
	private int studentId;
	private int courseId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	
}
