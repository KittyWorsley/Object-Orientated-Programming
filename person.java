import java.io.serializable;

public class Person implements serializable{
    protected String name;
    protected int age;

public Person( String name,int age){
    this.name = name;
    this.age = age;


    public String getName(){
        return name;
    }
    }
} 