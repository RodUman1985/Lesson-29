package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DogRepository {
    private LinkedList<Dog> dogs=new LinkedList<>();
    public DogRepository(){
        this.dogs.add(new Dog("Dog#1",2,"black"));
        this.dogs.add(new Dog("Dog#2",3,"white"));
        this.dogs.add(new Dog("Dog#3",5,"rad"));
        this.dogs.add(new Dog("Dog#4",7,"yelou"));
        this.dogs.add(new Dog("Dog#5",4,"white"));
        this.dogs.add(new Dog("Dog#6",11,"black"));
        this.dogs.add(new Dog("Dog#7",3,"white"));
        this.dogs.add(new Dog("Dog#8",14,"rad"));
        this.dogs.add(new Dog("Dog#9",8,"black"));
        this.dogs.add(new Dog("Dog#10",7,"yelou"));
        this.dogs.add(new Dog("Dog#11",4,"white"));
        this.dogs.add(new Dog("Dog#12",11,"black"));
        this.dogs.add(new Dog("Dog#13",3,"white"));
        this.dogs.add(new Dog("Dog#14",5,"rad"));
        this.dogs.add(new Dog("Dog#15",5,"black"));
        this.dogs.add(new Dog("Dog#16",17,"white"));
        this.dogs.add(new Dog("Dog#17",2,"yelou"));
        this.dogs.add(new Dog("Dog#18",1,"white"));
        this.dogs.add(new Dog("Dog#19",3,"black"));
        this.dogs.add(new Dog("Dog#20",2,"rad"));

    }
    public List<Dog> getDogs(Dog.Pugination p){
        Stream<Dog> stream=this.dogs.stream();
        // фильтр по возрасту (если задан)
        if(p.getFromAge()!=null){
            stream = stream.filter((dog)->dog.getAge() >= p.getFromAge());

        }
        if(p.getToAge()!=null){
            stream = stream.filter((dog)->dog.getAge() <= p.getToAge());

        }
        return stream
                .skip((p.getPage()-1)*p.getPerPage())
                .limit(p.getPerPage())
                .collect(Collectors.toList());
    };
}
