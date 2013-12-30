package com.kum.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Location implements Serializable {

@Id
@GeneratedValue(strategy = GenerationType.TABLE)
private int id;
private String description;
@OneToMany(mappedBy = "location")
private java.util.List<Device> devices = new java.util.ArrayList<Device>();
//@Temporal(TemporalType.TIMESTAMP)
//private java.util.Calendar creationDate = java.util.Calendar.getInstance();

private static final long serialVersionUID = 1L;

public Location() {
super();
}

public int getId() {
return this.id;
}

public void setId(int id) {
this.id = id;
}

public String getDescription() {
return this.description;
}

public void setDescription(String description) {
this.description = description;
}

public java.util.List<Device> getDevices() {
return devices;
}

//public java.util.Calendar getCreationDate() {
//return creationDate;
//}
//
//public void setCreationDate(java.util.Calendar creationDate) {
//this.creationDate = creationDate;
//}

public void setDevices(java.util.List<Device> devices) {
this.devices = devices;
}
}