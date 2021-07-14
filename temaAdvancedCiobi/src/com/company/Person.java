package com.company;
//1. Creati o clasa abstracta Person cu urmatoarele campuri:
//- nume
//- sex
//- bio(scurta descriere)
//- age
//- clasa

//2. Creati un constructor pentru aceste campuri.
//3. Generati metodele de getter si setter pentru campuri.
//4. Creati o interfata de DisplayPersonInfo cu metoda de displayInfo care sa returneze numele si bio de la o persoana
//5. Suprascrieti metoda de toString care sa afiseze toate campurile.
//6. Creati clasa de Student care sa extinda clasa de Persoane
//7. Adaugati urmatoarele campuri pentru clasa de Student
//- lista cu note
//- media de la note
//9. Creati un constructor in clasa de Student cu lista de note si getter si setter pentru campurile adaugate(lista cu note si media de la note).
//10. Creati clasa de Profesor care extinda clasa de Persoane
//11. Creati o Lista de profesori cu implementarea de ArrayList si afisati informatiile despre profesori folosind metoda de displayInfo.
//12. Creati o Lista de studenti cu implementarea de ArrayList si adaugati niste note pentru fiecare student.
//13. Parcurgeti lista de studenti si calculati media notelor pe baza notelor date. Pentru calcularea notelor sa creati o metoda in clasa de Student care sa calculeze media notelor. Atribuiti rezultatul metodei campului de media la note.
//14. Listati doar acei studenti care au o media a notelor intre 8 si 10.
//15. Listati studentii care au varsta intre 18 si 22 de ani.
//16. Creati o exceptie care necesita tratare cu numele de NotaGresita
//17. Aruncati o exceptie de NotaGresita in metoda de calculare a mediei notelor caz in care in lista apare o nota care nu este cuprinsa intre 1 si 10
//18. Stergeti studentii care nu au nota de trecere din lista de studenti.
//19. Adaugati un student cu numele de Vasile Axinte in lista de studenti.
//19. Inlocuiti studentul cu numele Vasile Axinte cu studentul Mircea Pedalache.
//20. Cautati studentul cu cea mai mare medie din lista.
//21. Afisati fiecare clasa cu profesorul si studentii aferenti(fiecare clasa sa aiba 1 profesor).

public abstract class Person {
    private  String nume;
    private Gender gender;
    private  String bio; //scurta descriere
    private byte age;
    private String clasa;

    public Person(String nume, Gender gender, String bio, byte age, String clasa) {
        this.nume = nume;
        this.gender = gender;
        this.bio = bio;
        this.age = age;
        this.clasa = clasa;
    }

    public Person(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getClasa() {
        return clasa;
    }

    public void setClasa(String clasa) {
        this.clasa = clasa;
    }

    //5. Suprascrieti metoda de toString care sa afiseze toate campurile.


    @Override
    public String toString() {
        return "Person{" +
                "nume='" + nume + '\'' +
                ", gender=" + gender +
                ", bio='" + bio + '\'' +
                ", age=" + age +
                ", clasa='" + clasa + '\'' +
                '}';
    }
}
