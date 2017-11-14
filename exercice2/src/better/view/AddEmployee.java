package better.view;

import better.service.Personnel;
import better.domain.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddEmployee extends JPanel implements ActionListener {
    private final HomeFrame app;
    private Personnel p;

    public static String[] tabProfession= new String[] {"ManutARisque", "Manutentionnaire", "Representant", "TechnARisque", "Technicien", "Vendeur"};

    JLabel lastName = new JLabel("Nom");
    JLabel firstName = new JLabel("Prénom");
    JLabel age = new JLabel("Age");
    JLabel profession = new JLabel("Profession");
    JLabel entryDate = new JLabel("Date d'entrée");
    JLabel salary = new JLabel("Salaire");

    JTextField inpLastName = new JTextField(15);
    JTextField inpFirstName = new JTextField(15);
    JTextField inpAge = new JTextField(5);
    JTextField inpEntryDate = new JTextField(7);
    JTextField inpSalary = new JTextField(7);

    JComboBox<String> inpProfession = new JComboBox<>();


    JButton addButton = new JButton("Ajouter");
    JButton backMenu = new JButton("Retour au menu");
    JButton listEmlpoyees = new JButton("Afficher emlpoyés");



    public void addEmployee() {

        for (int i = 0; i < tabProfession.length; i++) {
            inpProfession.addItem(tabProfession[i]);
        }

        this.add(lastName);
        this.add(inpLastName);
        this.add(firstName);
        this.add(inpFirstName);
        this.add(age);
        this.add(inpAge);
        this.add(profession);
        this.add(inpProfession);
        this.add(entryDate);
        this.add(inpEntryDate);
        this.add(salary);
        this.add(inpSalary);
        this.add(addButton);
        this.add(listEmlpoyees);
        this.add(backMenu);
        addButton.addActionListener(this);
        listEmlpoyees.addActionListener(e -> app.listEmployee());
        backMenu.addActionListener(e ->app.displayMenu());

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String fieldLastName = inpLastName.getText();
        String fieldFirstName = inpFirstName.getText();
        int fieldAge = Integer.parseInt(inpAge.getText());
        String fieldProfession = (String) inpProfession.getSelectedItem();
        String fieldEntryDate = inpEntryDate.getText();
        Double fieldSalary = Double.valueOf(inpSalary.getText());

        try {
            Employee f = (Employee) Class.forName("better.domain."+fieldProfession)
                    .getConstructor(String.class, String.class, int.class, String.class, double.class)
                    .newInstance((String)fieldFirstName, (String)fieldLastName, (int)fieldAge, (String)fieldEntryDate, (Double)fieldSalary);
            p.ajouterEmploye(f);
            System.out.println(f);
        } catch (Exception k) {
            k.printStackTrace();
        }
    }

    public AddEmployee(HomeFrame app, Personnel p){
        addEmployee();
        this.app = app;
        this.p=p;
    }
}
