package com.learnspring.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    public String name;

    public Integer age;

    //CONSTRUCTORS

    public Cat (){

    }

    public Cat(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    //ID GETTER SETTER

    public Integer getId (){
        return this.id;

    }

    public void setId (Integer id){
        this.id = id;
    }

    //NAME GETTER SETTER

    public String getName (){
        return this.name;

    }

    public void setName (String name){
        this.name = name;
    }

    // AGE GETTER SETTER

    public Integer getAge (){
        return this.age;

    }

    public void setAge (Integer age){
        this.age = age;
    }
}
