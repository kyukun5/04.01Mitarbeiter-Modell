package view;

import control.MainController;
import model.MainModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewEmployeeGUI {
    private MainController mainController;
    private MainFrame mainFrame;
    private PanelHandler panelHandler;

    private JButton submitNewButton;
    private JPanel panel;
    private JTextField newWork;
    private JTextField newAge;
    private JTextField newSalary;
    private JTextField newEmployment;
    private JTextField newName;
    //private MainModel mainModel;

    public NewEmployeeGUI(PanelHandler panelHandler) {
        this.panelHandler=panelHandler;
        submitNewButton.setText("Submit");
        submitNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                panelHandler.getNameLabel().setText("Name: "+newName.getText());
                panelHandler.getAgeLabel().setText("Age: "+newAge.getText());
                panelHandler.getWorkLabel().setText("Work: "+newWork.getText());
                panelHandler.getSalaryLabel().setText("Salary: "+newSalary.getText());
                panelHandler.getEmploymentLabel().setText("Employment: "+newEmployment.getText());
                //TODO closeNewEmployee - create a new tab with the new Employee
                mainFrame=new MainFrame(mainController,"Employee02",200,50,500,500);
                panelHandler.resetNew();
                panelHandler.getEditEmployeeButton().setEnabled(true);
            }
        });
    }
    public JPanel getPanel() {
        return panel;
    }
    public JButton getSubmitNewButton() {
        return submitNewButton;
    }
}
