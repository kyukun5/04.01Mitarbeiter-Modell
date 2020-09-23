package control;

import model.MainModel;
import view.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController{

    private MainModel model;
    private MainFrame mainFrame;
    public MainController(){
        this.model=new MainModel();
        this.mainFrame=new MainFrame(this, "Employee 0:",50,50,500,500);
        model.getFrames().add(mainFrame);
        this.getModel().getFrames().get(0).switchToPanel(this.getModel().getFrames().get(0).getPanelHandler().getPanel());
    }

    public MainFrame getMainFrame() {
        return mainFrame;
    }
    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }
    public MainModel getModel() {
        return model;
    }
    public void setModel(MainModel model) {
        this.model = model;
    }
    public void createButtons(){
        mainFrame.getPanelHandler().getNewEmployeeButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainFrame.getPanelHandler().getEditEmployeeButton().setEnabled(false);
                mainFrame=new MainFrame(getMainController(),"NewEmployee",1200,50,500,500);
                mainFrame.switchToPanel(mainFrame.getPanelHandler().getNewEmp().getPanel());
            }
        });
        mainFrame.getPanelHandler().getEditEmployeeButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainFrame.getPanelHandler().getNewEmployeeButton().setEnabled(false);
                mainFrame = new MainFrame(getMainController(),"EditEmployee",1200,50,500,500);
                mainFrame.switchToPanel(mainFrame.getPanelHandler().getEdit().getPanel());
            }
        });
    }
    public void updateGUI(String name, String age, String salary, String employment, String work){
        mainFrame.getPanelHandler().getNameLabel().setText("Name: "+name);
        mainFrame.getPanelHandler().getAgeLabel().setText("Age: "+age);
        mainFrame.getPanelHandler().getSalaryLabel().setText("Salary: "+salary);
        mainFrame.getPanelHandler().getEmploymentLabel().setText("Time Employed: "+employment);
        mainFrame.getPanelHandler().getWorkLabel().setText("Currently Working on: "+work);
    }

    public MainController getMainController(){
        return this;
    }
}

