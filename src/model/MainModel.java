package model;

import view.MainFrame;

import java.util.ArrayList;

public class MainModel {
    private ArrayList<Employee> employees;
    private ArrayList<MainFrame> frames;
    //TODO alles in MainModel abspeichern
    public MainModel(){
        frames=new ArrayList<MainFrame>();
        employees=new ArrayList<Employee>();
    }


    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<MainFrame> getFrames() {
        return frames;
    }

    public void setFrames(ArrayList<MainFrame> frames) {
        this.frames = frames;
    }
}
