package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditEmployeeGUI{
    private PanelHandler panelHandler;
    private JButton submitEditButton;
    private JPanel panel;
    private JTextField editEmployment;
    private JTextField editSalary;
    private JTextField editWork;
    private JTextField editAge;
    private JTextField editName;

    public EditEmployeeGUI(PanelHandler panelHandler) {
        this.panelHandler=panelHandler;
        submitEditButton.setText("Submit");
        submitEditButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                panelHandler.getNewEmployeeButton().setEnabled(true);
                panelHandler.updateGUI(editName.getText(),editAge.getText(),editSalary.getText(),editEmployment.getText(),editWork.getText());
                //TODO closeEdit
                panelHandler.resetEdit();
            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }

    public JButton getSubmitEditButton() {
        return submitEditButton;
    }
}
