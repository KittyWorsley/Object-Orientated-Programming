import java.time.LocalDate;

public class {
    private String name;
    private String gender;
    private LocalDate getdateOfBirth;
    private String nationality;
    private String address;
    private LocalDate registrationDate;
    
    public person (String name, String gender,LocalDate dateOfBirth, String nationality, String address, LocalDate registrationDate)
    this.name
    this.gender = gender;
    this.getdateOfBirth = dateOfBirth;
    this.nationality = nationality;
    this.address = address;
    this.registrationDate = registrationDate;


}

public String getName() { return name;}
public String getGender(){return gender;}
public LocalDate getDateOfBirth(){return dateOfBirth;}
public String getNationality(){return nationality;}
public String getAddress() {return address;}
public LocalDate     getRegistrationDate(){return registrationDate;}

@override 
public String toString(){
    return name + "," + gender + "," + dateOfBirth + "," + nationality + "," + address + "," + registrationDate;
}
