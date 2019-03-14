package ru.job4j.profession;


public class Doctor extends Profession {

    private Diagnose diagnose;

    public Doctor(String name) {
        super(name);
    }

    public Diagnose heal(Patient patient) {
       
        return diagnose;
    }
}