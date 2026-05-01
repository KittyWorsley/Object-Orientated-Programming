
class UniversityHall {
    private String name;
    private  int age;
    
    public UniversityHall(String name, int age){
        this.name = name;
        this.age = age;
    }
        public String getName() { return name;}
        public int getAge() { return age;}
    

    @Override
    public String toString() {
        return name + "," + age;
    }
    public static void main(String[] args) {
        System.out.println("UniversityHall class loaded.");
    }
}