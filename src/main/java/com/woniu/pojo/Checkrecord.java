package com.woniu.pojo;
// Generated 2019-12-19 14:36:06 by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Checkrecord generated by hbm2java
 */
public class Checkrecord implements java.io.Serializable {

	private int crid;
	private Checktype checktype;
	private Classes classes;
	private Student student;
	private Date crdate;
	private Set students = new HashSet(0);

	public Checkrecord() {
	}

	public Checkrecord(int crid) {
		this.crid = crid;
	}

	public Checkrecord(int crid, Checktype checktype, Classes classes, Student student, Date crdate, Set students) {
		this.crid = crid;
		this.checktype = checktype;
		this.classes = classes;
		this.student = student;
		this.crdate = crdate;
		this.students = students;
	}

	public int getCrid() {
		return this.crid;
	}

	public void setCrid(int crid) {
		this.crid = crid;
	}

	public Checktype getChecktype() {
		return this.checktype;
	}

	public void setChecktype(Checktype checktype) {
		this.checktype = checktype;
	}

	public Classes getClasses() {
		return this.classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Date getCrdate() {
		return this.crdate;
	}

	public void setCrdate(Date crdate) {
		this.crdate = crdate;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

}