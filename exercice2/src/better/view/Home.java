package better.view;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Home extends JPanel {
    private final HomeFrame app;
    JButton btnAddEmployee = new JButton("Ajouter employé");
    JButton btnShowEmployee = new JButton("Afficher les employés");

    public Home(HomeFrame app) {
        home();
        this.app = app;
    }

    public void home(){
        this.setLayout(new FlowLayout());
        this.add(btnAddEmployee);
        btnAddEmployee.addActionListener(e ->app.addEmlpoyee());
        this.add(btnShowEmployee);
        btnShowEmployee.addActionListener(e ->app.listEmployee());
    }
}
    //Lanceur
