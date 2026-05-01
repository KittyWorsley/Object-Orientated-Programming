import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

public class Main {

    static ArrayList<String> people = new ArrayList<>();
    static int index = 0;
    static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Store");

        JLabel nameLabel = new JLabel("Enter name:");
        JTextField nameField = new JTextField(15);

        JLabel ageLabel = new JLabel("Enter age:");
        JTextField ageField = new JTextField(15);

         JButton addButton = new JButton("Add");
         JButton nextButton = new JButton("Next");
         JButton  saveButton = new JButton("Save");
         JButton  loadButton = new JButton("load");

        JLabel output = new JLabel("No records yet");

        addButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            String ageText = ageField.getText().trim();

            if (name.isEmpty() || ageText.isEmpty()) {
                output.setText("Please enter name and age");
                return;
            }

            try {
                int age = Integer.parseInt(ageText);

                if (age <= 0 || age > 120) {
                    output.setText("Please enter a valid age");
                    return;
                }

                people.add(name + "," + age);
                output.setText("Student added: " + name);

                nameField.setText("");
                ageField.setText("");

            } catch (NumberFormatException ex) {
                output.setText("Age must be a number");
            }
        });

      
        nextButton.addActionListener(e -> {
            if (people.isEmpty()) {
                output.setText("No records to display");
            } else {
                output.setText("Record: " + people.get(index));
                index = (index + 1) % people.size();
            }
        });

        
        saveButton.addActionListener(e -> {
            try {
                PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));

                for (String person : people) {
                    writer.println(person);
                }

                writer.close();
                output.setText("Records saved");

            } catch (IOException ex) {
                output.setText("Save error");
            }
        });

        loadButton.addActionListener(e -> {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));

                people.clear();
                index = 0;

                String line;
                while ((line = reader.readLine()) != null) {
                    people.add(line);
                }

                reader.close();
                output.setText("Records loaded");

            } catch (IOException ex) {
                output.setText("Load error - file not found");
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 1, 5, 5));

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(addButton);
        panel.add(nextButton);
        panel.add(saveButton);
        panel.add(loadButton);
        panel.add(output);

        frame.add(panel);
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}