package better.view;

import javax.swing.*;

public class AddEmployee extends JPanel {
    public final HomeFrame app;
    public static String[] tabProfession= new String[] {"Manutentionnaire", "Manutentionnaire à  risque", "Représentant", "Vendeur", "Technicien", "Technicien à risque"};
    JLabel lastName = new JLabel("Nom");
    JLabel firstName = new JLabel("Prénom");
    JLabel age = new JLabel("Age");
    JLabel profession = new JLabel("Profession");
    JLabel entryDate = new JLabel("Date d'entrée");
    JLabel salary = new JLabel("Salaire");

    JTextField inpLastName = new JTextField(20);
    JTextField inpFirstName = new JTextField(20);
    JTextField inpAge = new JTextField(10);
    JTextField inpEntryDate = new JTextField(10);
    JTextField inpSalary = new JTextField(10);

    JComboBox<String> inpProffesion = new JComboBox<>();


    JButton addButton = new JButton("Ajouter");
    JButton backMenu = new JButton("Retour au menu");

    public AddEmployee(HomeFrame app){
        addEmployee();
        this.app = app;
    }

    public void addEmployee() {

        for (int i = 0; i < tabProfession.length; i++) {
            inpProffesion.addItem(tabProfession[i]);
        }

        this.add(lastName);
        this.add(inpLastName);
        this.add(firstName);
        this.add(inpFirstName);
        this.add(age);
        this.add(inpAge);
        this.add(profession);
        this.add(inpProffesion);
        this.add(entryDate);
        this.add(inpEntryDate);
        this.add(salary);
        this.add(inpSalary);
        this.add(addButton);
        this.add(backMenu);
        backMenu.addActionListener(e ->app.displayMenu());
    }
}
