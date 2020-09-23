package view;

import control.MainController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ambrosius on 11.09.2020.
 */
public class MainFrame extends JFrame {

    // Attribute

    // Referenzen
    private MainController mainController;
    private PanelHandler panelHandler;


    /**
     * Konstruktor
     * @param name Der Titel des Fensters
     * @param x Die obere linke x-Koordinate des Fensters bzgl. des Bildschirms
     * @param y Die obere linke y-Koordinaite des Fensters bzgl. des Bildschirms
     * @param width Die Breite des Fensters
     * @param height Die Höhe des Fensters
     */
    public MainFrame(MainController mainController, String name, int x, int y, int width, int height) {
        this.mainController = mainController;
        this.panelHandler=new PanelHandler(mainController);
        mainController.setMainFrame(this);

        this.setLocation(x,y);
        this.setSize(width,height);
        this.setTitle(name);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true);

    }
    /**
     * Mithilfe dieser Methode wird das übergebene JPanel-Objekt im Fenster angezeigt. Hierzu wird das aktuell vorhandene JPanel-Objekt zunächst entfernt.
     * @param panel Das JPanel-Obejkt, das angezeigt werden soll.
     */
    public void switchToPanel(JPanel panel){
        this.getContentPane().removeAll();
        this.getContentPane().add(panel);
        this.validate();
        this.repaint();
    }
    public PanelHandler getPanelHandler() {
        return panelHandler;
    }
}
