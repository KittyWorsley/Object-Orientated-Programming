public class main{
    public static void main(string [] args){
        Store store = new Store();


        student s1 = new Student("Jim",19,1,false);
        Student s2 = new Student("Olivia", 21,2, true);

        store.add(s1);
        store.add(s2);

system.out.printIn(store.getNext().getNext());
system.out.printIn(store.getNext().getNext());
system.out.printIn(store.getNext().getNext());

    }
}


Store store = new store();
TextField nameField = new TextField();
nameField.setPromptText("Enter name");

TextField ageField = new TextField();
ageField.setPromptText("Enter age");

Button addBtn = new Button("Add");
Button nextBtn = new Button("Next");
Button saveBtn = new Button ("Save");
Button LoadBtn = new Button("Load");

label output = new label();

addBtn.setonAction(e -> {
    try {
        Stirng name = nameField.getText();
        int age = INteger.paseInt(ageField.getText())

        Student s =  new Student(name, age,1, false);
        store.add (s);

        output.setText("Invalid input");

    }
}):

nextBtn.setOnAction (e -> {
    person p =store.getNext();
    if (p != null) {
        output.setText("Name: " + p.getName())
        else {
            output.setText("No records");
        
        }}
    });
    
saveBtn.setOnAction(e ->{
    try {
        FileHandler.save(store);
        output.setText("Saved");
     } catch( Exception ex){
        output.setText("Save error")
     }
});

LoadBtn.setOnAction(e ->{
   try {
    store.getAll().clear();
    store.getAll().addAll(FileHandler.load())
    output.setText("Loaded");
    }catcfh (Exception ex){
        output.setText("Load error";)
    }
});

VBox layout = new VBox(10);
layout.getChildren(),addAll(
    nameField,
    ageField,
    addBtn,
    nextBtn,
    saveBtn,
    LoadBtn,
    output
);