package com.kum.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Function implements Serializable {

@Id
@GeneratedValue(strategy = GenerationType.TABLE)
private int id;
//private double salary;
private String functionDescription;
//@Temporal(TemporalType.TIMESTAMP)
//private java.util.Calendar creationDate = java.util.Calendar.getInstance();
private static final long serialVersionUID = 1L;

public Function() {
super();
}

public int getId() {
return this.id;
}

public void setId(int id) {
this.id = id;
}

//public double getSalary() {
//return this.salary;
//}
//
//public void setSalary(double salary) {
//this.salary = salary;
//}

public String getFunctionDescription() {
return this.functionDescription;
}

public void setFunctionDescription(String functionDescription) {
this.functionDescription = functionDescription;
}

//public java.util.Calendar getCreationDate() {
//return creationDate;
//}
//
//public void setCreationDate(java.util.Calendar creationDate) {
//this.creationDate = creationDate;
//}
}