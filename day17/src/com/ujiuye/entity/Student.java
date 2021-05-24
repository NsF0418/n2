package com.ujiuye.entity;


import java.sql.Date;

public class Student {

  private long sid;
  private String sname;
  private String gender;
  private java.sql.Date sbir;
  private String hobby;
  private String photo;

  public Student(long sid, String sname, String gender, Date sbir, String hobby, String photo) {
    this.sid = sid;
    this.sname = sname;
    this.gender = gender;
    this.sbir = sbir;
    this.hobby = hobby;
    this.photo = photo;
  }

  public Student() {
    }

    public long getSid() {
    return sid;
  }

  public void setSid(long sid) {
    this.sid = sid;
  }


  public String getSname() {
    return sname;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public java.sql.Date getSbir() {
    return sbir;
  }

  public void setSbir(java.sql.Date sbir) {
    this.sbir = sbir;
  }


  public String getHobby() {
    return hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }


  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

}
