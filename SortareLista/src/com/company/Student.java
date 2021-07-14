package com.company;

public class Student implements Comparable<Student>{

    private String name;
    private Float media;
    private String clasa;

    public Student(String name, Float media, String clasa) {
        this.name = name;
        this.media = media;
        this.clasa = clasa;
    }

    @Override
    public int compareTo(Student student) {
        int value = name.compareTo(student.name);
        System.out.println("Namwe1: " + name + " Name2: " + student.name + " value: "+ value);
        return value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMedia() {
        return media;
    }

    public void setMedia(Float media) {
        this.media = media;
    }

    public String getClasa() {
        return clasa;
    }

    public void setClasa(String clasa) {
        this.clasa = clasa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", media=" + media +
                ", clasa='" + clasa + '\'' +
                '}';
    }
}
