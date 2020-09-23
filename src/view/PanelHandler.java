package view;

import control.MainController;
import model.MainModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelHandler {
    private MainFrame mainFrame;
    private JPanel panel;

    private EditEmployeeGUI edit;
    private NewEmployeeGUI newEmp;

    private JButton editEmployeeButton;
    private JButton newEmployeeButton;
    private JLabel salaryLabel;
    private JLabel ageLabel;
    private JLabel workLabel;
    private JLabel employmentLabel;
    private JLabel nameLabel;

    private MainController mainController;
    public PanelHandler(MainModel mainModel, MainController mainController) {
        this.mainController=mainController;
        edit=new EditEmployeeGUI(this);
        newEmp=new NewEmployeeGUI(this);
        createButtons();
        updateGUI(null,null,null,null,null);
    }
    public void createButtons(){
        editEmployeeButton.setText("Edit");
        newEmployeeButton.setText("Create New Employee");
        newEmployeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //TODO aufrufen des NewEmployeeGUIs
                /*
                mainFrame.getMainModel().getFrames().add(new MainFrame(mainFrame.getMainModel(), mainController,"NewEmployee",1200,50,500,500));
                mainFrame.getMainModel().getFrames().get(1).switchToPanel(newEmp.getPanel());
                */
                editEmployeeButton.setEnabled(false);
                mainFrame=new MainFrame(mainController,"NewEmployee",1200,50,500,500);
                mainFrame.switchToPanel(newEmp.getPanel());
                //mainFrame.switchToPanel(newEmp.getPanel());
            }
        });
        editEmployeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //TODO aufrufen des EditEmployeeGUIs
                newEmployeeButton.setEnabled(false);
                mainFrame = new MainFrame(mainController,"EditEmployee",1200,50,500,500);
                mainFrame.switchToPanel(edit.getPanel());

            }
        });

        //mainController.handlePanelHandler();
    }
    public void updateGUI(String name, String age, String salary, String employment, String work){
        nameLabel.setText("Name: "+name);
        ageLabel.setText("Age: "+age);
        salaryLabel.setText("Salary: "+salary);
        employmentLabel.setText("Time Employed: "+employment);
        workLabel.setText("Currently Working on: "+work);
    }

    public JPanel getPanel(){
        return panel;
    }
    public JLabel getSalaryLabel() {
        return salaryLabel;
    }
    public JLabel getAgeLabel() {
        return ageLabel;
    }
    public JLabel getWorkLabel() {
        return workLabel;
    }
    public JLabel getEmploymentLabel() {
        return employmentLabel;
    }
    public JLabel getNameLabel() {
        return nameLabel;
    }
    public JButton getEditEmployeeButton() {
        return editEmployeeButton;
    }
    public JButton getNewEmployeeButton() {
        return newEmployeeButton;
    }

    public void resetEdit(){
        edit=new EditEmployeeGUI(this);
        mainFrame.getContentPane().removeAll();
    }
    public void resetNew(){
        newEmp=new NewEmployeeGUI(this);
        mainFrame.getContentPane().removeAll();
    }

    public EditEmployeeGUI getEdit() {
        return edit;
    }

    public NewEmployeeGUI getNewEmp() {
        return newEmp;
    }
}
