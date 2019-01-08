package com.intuit;


public class Info {
	private String course;
	private long duration;
	private String instructor;
	
	public Info() {
	}
	public Info(String course, long duration, String instructor) {
		this.course = course;
		this.duration = duration;
		this.instructor = instructor;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	
}
