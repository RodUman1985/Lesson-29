package com.company;

import java.util.LinkedList;
import java.util.List;

public class DogRepository {
    private LinkedList<Dog> dogs=new LinkedList<>();
    public DogRepository(){
        this.dogs.add(new Dog("Dog#1",2,"black"));
        this.dogs.add(new Dog("Dog#2",3,"white"));
        this.dogs.add(new Dog("Dog#3",5,"rad"));
        this.dogs.add(new Dog("Dog#4",7,"yelou"));
        this.dogs.add(new Dog("Dog#5",4,"white"));
        this.dogs.add(new Dog("Dog#6",1,"black"));
        this.dogs.add(new Dog("Dog#7",3,"white"));
        this.dogs.add(new Dog("Dog#8",4,"rad"));
        this.dogs.add(new Dog("Dog#9",8,"black"));
        this.dogs.add(new Dog("Dog#10",7,"yelou"));
        this.dogs.add(new Dog("Dog#11",4,"white"));
        this.dogs.add(new Dog("Dog#12",1,"black"));
        this.dogs.add(new Dog("Dog#13",3,"white"));
        this.dogs.add(new Dog("Dog#14",5,"rad"));
        this.dogs.add(new Dog("Dog#15",5,"black"));
        this.dogs.add(new Dog("Dog#16",7,"white"));
        this.dogs.add(new Dog("Dog#17",2,"yelou"));
        this.dogs.add(new Dog("Dog#18",1,"white"));
        this.dogs.add(new Dog("Dog#19",3,"black"));
        this.dogs.add(new Dog("Dog#20",2,"rad"));

    }
    public List<Dog> getDogs(Dog.Pugination p){

    };
}
