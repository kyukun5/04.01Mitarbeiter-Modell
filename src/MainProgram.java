import control.MainController;
import model.MainModel;
import view.MainFrame;
import view.NewEmployeeGUI;

import java.awt.*;

public class MainProgram {
    private static MainFrame panelHandle;
    public static void main (String[] args){
        EventQueue.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        MainProgram.setup();
                    }
                });
    }

    private static void setup(){
        MainController mainController = new MainController();
        MainModel mainModel=new MainModel();
        mainModel.getFrames().add(new MainFrame(mainController, "Employee01",50,50,1200,900));
        mainModel.getFrames().get(0).switchToPanel(mainModel.getFrames().get(0).getPanelHandler().getPanel());
        //panelHandle=new MainFrame(mainController, "Employee01",50,50,1200,900);
        //panelHandle.switchToPanel(panelHandle.getPanelHandler().getPanel());
        //mainController.setMainFrame(mainFrame);

    }

}
