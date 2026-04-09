public class student extends person {
    private int yearOfStudy;
    private double rent;
    private String dietryRequirement;
    private boolean specialNeeds;

    public student(String name, String gender, LocalDate dateOfBirth, String nationality, String address, LocalDate registrationDate, int yearOfStudy, double rent, String dietryRequirement,boolean specialNeeds){
        super( name,gender, dateOfBirth,nationality,address,registrationDate);
        this.yearOfStudy = yearOfStudy;
        this.rent = rent;
        this.dietryRequirement= dietryRequirement;
        this.specialNeeds = specialNeeds;
    }
}
public int getYearOfStudy(){ return yearOfStudy;}
public double getRent(){ return rent;}
 
 @override
 public String toString(){
    return name +","+ gender+","+dateOfBirth+"," + nationality +"," + address +"," + registrationDate;
 }