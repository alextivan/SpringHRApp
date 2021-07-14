package com.company;

import java.util.ArrayList;
import java.util.List;

//6. Creati clasa de Student care sa extinda clasa de Persoane
public class Student extends Person{


    public Student(String nume, Gender gender, String bio, byte age, String clasa) {
        super(nume, gender, bio, age, clasa);
    }

    public Student(String nume) {
        super(nume);
    }

    //7. Adaugati urmatoarele campuri pentru clasa de Student
//- lista cu note
//- media de la note
    private ArrayList<Integer> listaCuNote;
    private Float mediaDeLaNote;

 //  {
 //      assert listaCuNote != null;
 //      mediaDeLaNote = averageCalculationNotes(listaCuNote);
 //  }


//9. Creati un constructor in clasa de Student cu lista de note si getter si setter pentru campurile adaugate(lista cu note si media de la note).

    public Student(String nume, Gender gender, String bio, byte age, String clasa, ArrayList<Integer> listaCuNote, Float mediaDeLaNote) {
        super(nume, gender, bio, age, clasa);
        this.listaCuNote = listaCuNote;
        this.mediaDeLaNote = mediaDeLaNote;
    }

    //13. Parcurgeti lista de studenti si calculati media notelor pe baza notelor date.
    // Pentru calcularea notelor sa creati o metoda in clasa de Student care sa calculeze media notelor.
    // Atribuiti rezultatul metodei campului de la media la note.

    public static float averageCalculationNotes(ArrayList<Integer> listaCuNote){
    float sum = 0;
    if(!listaCuNote.isEmpty()){
        for(Integer note : listaCuNote){
            sum += note;
        }
        return sum/listaCuNote.size();
    }
    return sum;
    }

    public ArrayList<Integer> getListaCuNote() {
        return listaCuNote;
    }

    public void setListaCuNote(ArrayList<Integer> listaCuNote) {
        this.listaCuNote = listaCuNote;
    }

    public Float getMediaDeLaNote() {
        return mediaDeLaNote;
    }

    public void setMediaDeLaNote(Float mediaDeLaNote) {
        this.mediaDeLaNote = mediaDeLaNote;
    }

}
