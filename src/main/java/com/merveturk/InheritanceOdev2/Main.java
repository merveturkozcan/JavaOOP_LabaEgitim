package com.merveturk.InheritanceOdev2;
   /*
    UML kullanarak oluşturduğumuz üniversite
    organizasyonuna gerekli anlaşmaları interface’ler üzerinden
    yapmalıyız.Bu yapının png çıktısı ile birlikte bir önceki derste verdiğimiz üniversite
    organizasyonu ve yeni eklenecek interface yapısının kodlaması yapılarak githuba atılmalı.
    linki paylaşılmalı.
   */

interface Personel {
    void setName(String name);

    void info();

    void setYas(int yas);

}

abstract class Fakulte implements Personel {
    String name;
    int yas;

    @Override
    public void info() {
        System.out.println("bu metod fakulte personelidir.");
    }

}

abstract class Yonetim implements Personel {

    String name;
    int yas;

    @Override
    public void info() {
        System.out.println("bu metod yonetim personelidir.");
    }

}

class Profesor extends Yonetim {
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setYas(int yas) {
        this.yas = yas;

    }

    @Override
    public void info() {
        System.out.println("bu metod Profesor personelidir." + this.name + " " + this.yas);
    }
}

class Rektor extends Fakulte {
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setYas(int yas) {
        this.yas = yas;

    }

    @Override
    public void info() {
        System.out.println("bu metod Rektor personelidir." + this.name + " " + this.yas);
    }

}


public class Main {
    public static void main(String[] args) {

        Personel person1 = new Profesor();
        person1.setName("merve");
        person1.setYas(23);
        person1.info();

        Personel person2 = new Rektor();
        person2.setName("ali");
        person2.setYas(25);
        person2.info();


    }

}
