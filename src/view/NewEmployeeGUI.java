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
    private MainModel mainModel;

    public NewEmployeeGUI(PanelHandler panelHandler) {
        this.panelHandler=panelHandler;
        submitNewButton.setText("Submit");
        submitNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainFrame=new MainFrame(mainController,"Employee02",200,50,500,500);

                mainFrame.switchToPanel(mainFrame.getPanelHandler().getPanel());
                mainFrame.getPanelHandler().getNameLabel().setText("Name: "+newName.getText());
                mainFrame.getPanelHandler().getAgeLabel().setText("Age: "+newAge.getText());
                mainFrame.getPanelHandler().getWorkLabel().setText("Work: "+newWork.getText());
                mainFrame.getPanelHandler().getSalaryLabel().setText("Salary: "+newSalary.getText());
                mainFrame.getPanelHandler().getEmploymentLabel().setText("Employment: "+newEmployment.getText());
                mainFrame.switchToPanel(mainFrame.getPanelHandler().getPanel());
                panelHandler.getEditEmployeeButton().setEnabled(true);


                panelHandler.getMainController().getModel().getFrames().add(mainFrame);
                panelHandler.getMainController().getModel().getFrames().get(panelHandler.getMainController().getModel().getFrames().indexOf(mainFrame)).setTitle
                        ("Employee "+((panelHandler.getMainController().getModel().getFrames().indexOf(mainFrame)))+": "+
                                panelHandler.getMainController().getModel().getFrames().get(panelHandler.getMainController().getModel().getFrames().indexOf(mainFrame)).getPanelHandler().getNameLabel().getText().split("Name:")[1]);
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
