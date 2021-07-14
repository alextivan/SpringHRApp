package com.company;

import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class DataRepository {

    private List<Group> groupList = new ArrayList<>();
    private List<Student> studentList = new ArrayList<>();
    private List<Trainer> trainerList = new ArrayList<>();

    public DataRepository(){
        init();
    }

    //we use this metod in order to initialize our data
    private void init(){
        initStudentList();
        initTrainerList();
        initGroupList();
    }

    private void initStudentList(){
        for(int i = 0; i < 15; i++){
            String firstName = RandomStringUtils.random(10, true, false);
            String lastName = RandomStringUtils.random(10, true, false);
            LocalDate localDate = createRandomDate(1970, 2000);
            Boolean hasJavaKnowledge = new Random().nextBoolean();
            Student student = new Student(firstName, lastName, localDate, hasJavaKnowledge);
            studentList.add(student);
        }
    }

    private void initTrainerList(){
        for(int i = 0; i < 15; i++){
            String firstName = RandomStringUtils.random(10, true, false);
            String lastName = RandomStringUtils.random(10, true, false);
            LocalDate localDate = createRandomDate(1970, 2000);
            Boolean isAuthorized = new Random().nextBoolean();
            Trainer trainer = new Trainer(firstName, lastName, localDate, isAuthorized);
            trainerList.add(trainer);
        }
    }

    private void initGroupList(){
        for(int i = 0; i < 4; i++){
            String groupName = "GroupName " + i;
            int randomGroupIndex = createRandomIntBerween(0, 2);
            Trainer trainer = trainerList.get(randomGroupIndex);
            Group group = new Group(groupName, trainer);
            groupList.add(group);
        }

try {
    groupList.get(0).addStudents(studentList.subList(0, 3));
    groupList.get(0).addStudents(studentList.subList(5, 9));

} catch (MaximumNunberOfStudentsReachedException e){
    e.printStackTrace();
}
        try {

            groupList.get(1).addStudents(studentList.subList(3, 6));

        } catch (MaximumNunberOfStudentsReachedException e){
            e.printStackTrace();
        }
        try {

            groupList.get(2).addStudents(studentList.subList(3, 11));

        } catch (MaximumNunberOfStudentsReachedException e){
            e.printStackTrace();
        }
        try {

            groupList.get(3).addStudents(studentList.subList(11, 15));
        } catch (MaximumNunberOfStudentsReachedException e){
            e.printStackTrace();
        }

    }
public void displayData(){
    for (Group group: groupList) {
        System.out.println(group);
        for(Student student: group.getStudents()){
            System.out.println(student);
        }
    }
}
    private LocalDate createRandomDate(int startYear, int endYear){
        int day = createRandomIntBerween(1, 28);
        int month = createRandomIntBerween(1, 12);
        int year = createRandomIntBerween(startYear, endYear);
        return LocalDate.of(year, month, day);
    }

    private Integer createRandomIntBerween(int start, int end){
        Random r = new Random();
        int result = r.nextInt(end-start) + start;
        return result;

    }
}
