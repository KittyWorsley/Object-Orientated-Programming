
class Student extends Person {
    private int yearOfStudy;
    private boolean specialNeeds;

    public Student(String name, int age,int yearOfStudy, boolean specialNeeds){
         super(name, age);
        this.yearOfStudy = yearOfStudy;
        this.specialNeeds = specialNeeds;

    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }
    public boolean hasSpecialNeeds() {
        return specialNeeds;
    }

    @Override
    public String toString() {
                    return  "Name: " + getName() +
                     "Age:" + getAge() + 
                     ", year: " + yearOfStudy + 
                     ", special needs: " + specialNeeds;
    }
}