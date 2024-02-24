package com.merveturk.InheritanceOdev1;

public class Main {
    /*
----------universite yapisi-----------
● Personel (Staff): Bu, diğer tüm personel sınıflarının temelini oluşturan soyut bir sınıftır.
● Öğretim Üyesi (Faculty): Akademik personeli temsil eden somut bir sınıftır. Personelden türetilmiştir.
● İdari Personel (AdministrativeStaff): İdari işlerle ilgilenen somut bir sınıftır ve Personelden türetilir.
● Profesör (Professor): Akademik hiyerarşide daha yüksek bir pozisyonu temsil eden, Öğretim Üyesinden
türetilmiş somut bir sınıftır.
● Rektör (Rector): Üniversitenin en üst düzey yöneticisini temsil eder ve İdari Personelden türetilmiştir.

* */
    public static void main(String[] args) {

        Staff person = new Professor();
        person.info();
        System.out.println(person.isAlive());

        person.setName("Professor Merve");
        System.out.println(person.getName());

        System.out.println("--------------");

        Staff person2= new Rector();
        person2.info();
        System.out.println(person2.isAlive());
        person2.setName("Rektör Ali ");
        System.out.println(person2.getName());


    }
}
