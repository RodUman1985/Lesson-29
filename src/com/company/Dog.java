package com.company;


public class Dog {
    private String name;
    private  int age;
    private String color;

    public  Dog (String name, int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
    public static class Pugination {
        private int page;
        private int perPage;
        private Integer fromAge=null;
        private Integer toAge=null;

        public int getPage() {
            return page;
        }

        public int getPerPage() {
            return perPage;
        }

        public Integer getFromAge() {
            return fromAge;
        }

        public Integer getToAge() {
            return toAge;
        }
    }
    public static class PuginationBuilder{
      private Pugination p;

      public PuginationBuilder( int page, int perPage){
          this.p=new Pugination();
          this.p.perPage=perPage;
          this.p.page= page;

        }

          public PuginationBuilder setMinAge(Integer age){
          this.p.fromAge=age;
          return this;
          }

        public PuginationBuilder setMaxAge(Integer age){
            this.p.fromAge=age;
            return this;
        }
        public Pugination build(){
          return this.p;
        }

    }
}
