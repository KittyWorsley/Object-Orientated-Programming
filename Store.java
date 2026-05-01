import java.util.ArrayList;

public class Store {
    
    private ArrayList<Person> people =new ArrayList<>();
    private int index = 0;

    public void add(Person p) {
        people.add(p);
    }

    public Person getNext(){
        if (people.isEmpty()) {
            return null;
        }
    }
   Person p = people.get(index);{
    index =(index +1 )% people.size();
   return p;
}
public ArrayList<Person> getPeople() {
    return people;
}
}


  

