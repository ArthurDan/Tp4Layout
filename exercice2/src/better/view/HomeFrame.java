package better.view;

import javax.swing.*;
import java.awt.*;
import better.domain.*;
import better.service.Personnel;

public class HomeFrame extends JFrame {
    static Personnel p = new Personnel();
    public HomeFrame(Personnel p ){
        super ("Application employés");
        this.setSize(1280, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(new FlowLayout());
        this.setVisible(true);
        this.p=p;
        displayMenu();
    }

    public static void main(String[] args) {
        p.ajouterEmploye(new Vendeur("Pierre", "Business", 45, "1995", 30000));
        p.ajouterEmploye(new Representant("Léon", "Vendtout", 25, "2001", 20000));
        p.ajouterEmploye(new Technicien("Yves", "Bosseur", 28, "1998", 1000));
        p.ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", 32, "1998", 45));
        p.ajouterEmploye(new TechnARisque("Jean", "Flippe", 28, "2000", 1000));
        p.ajouterEmploye(new ManutARisque("Al", "Abordage", 30, "2001", 45));
        p.afficherSalaires();
        HomeFrame fen = new HomeFrame(p);
    }

    public void displayMenu(){
        this.getContentPane().removeAll();
        this.setContentPane(new Home(this));
        this.revalidate();
        this.repaint();
    }

    public void addEmlpoyee(){
        this.getContentPane().removeAll();
        this.setContentPane(new AddEmployee(this, p));
        this.revalidate();
        this.repaint();
    }

    public void listEmployee(){
        this.getContentPane().removeAll();
        this.setContentPane(new ListEmployee(this, p));
        this.revalidate();
        this.repaint();
    }

}


