/**
 * 
 */
package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author Niraj
 *
 */
@Entity
@Data
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="sname",length=30,nullable=false)
	private String sname;
	
	@Column(name="course",length=40,nullable = false)
	private String course;
	
	@Column(name="fees")
	private double fees;

}
