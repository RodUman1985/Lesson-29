package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Cat> cats=new LinkedList<>();
        cats.add(new Cat ("Tom",12));
        cats.add(new Cat ("Jerry",10));
        cats.add(new Cat ("Vovan",2));
        cats.add(new Cat ("Lecsus",11));
        cats.add(new Cat ("Petrov",12));
        cats.add(new Cat ("Bashirov",11));
        cats.add(new Cat ("Kuzia",2));
        cats.add(new Cat ("Dante",14));
        // 'маппинг' - преобразование одного объекта в другой
        // .map - преоброзавание щбъектов класса Cat в объекты класс Dog
        cats.stream()
                .skip(2)// пропускает (удаляет) первые 2 элемента стрима
                .limit(3)// после этой операции в stream останется первые 3 объектов
                .map((Cat cat)-> new Dog(cat.getName(),cat.getAge(),"white")).forEach(System.out::println);


    }
}
