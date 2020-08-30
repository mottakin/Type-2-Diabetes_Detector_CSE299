package com.example.diabeticspredictor;

public class People {
    private String age;
    private String bmi;
    private String glucose;
    private String bp;
    private String skin;
    private String insulin;
    private String diabetes;
    private String pregnant;

    public People(String age, String bmi, String glucose, String bp, String skin, String insulin, String diabetes, String pregnant) {
        this.age = age;
        this.bmi = bmi;
        this.glucose = glucose;
        this.bp = bp;
        this.skin = skin;
        this.insulin = insulin;
        this.diabetes = diabetes;
        this.pregnant = pregnant;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public String getGlucose() {
        return glucose;
    }

    public void setGlucose(String glucose) {
        this.glucose = glucose;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getInsulin() {
        return insulin;
    }

    public void setInsulin(String insulin) {
        this.insulin = insulin;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getPregnant() {
        return pregnant;
    }

    public void setPregnant(String pregnant) {
        this.pregnant = pregnant;
    }
}
