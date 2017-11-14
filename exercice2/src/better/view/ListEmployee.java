package better.view;

import javax.swing.*;
import better.service.*;


public class ListEmployee extends JPanel{
    private final HomeFrame app;
    private Personnel p;

    String title[] = {"Nom", "Prénom", "Age", "Profession","Salaire","Date d'entrée"};
    JTable tabList;
    JButton back = new JButton("Retour au menu") ;

    public ListEmployee(HomeFrame app, Personnel p){
        this.app = app;
        this.p=p;
        tabList = new JTable(p.tableauSalaires(),title);
        listEmployee();
    }

    public void listEmployee(){

        this.add(new JScrollPane(tabList));
        this.add(back);
        back.addActionListener(e ->app.displayMenu());
    }
}
