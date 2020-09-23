package model;

import control.MainController;
import view.MainFrame;

import java.util.ArrayList;

public class MainModel {
    private ArrayList<Employee> employees;
    private ArrayList<MainFrame> frames;
    private ArrayList<Work> tasks;
    private MainController mainController;
    //TODO alles in MainModel abspeichern
    public MainModel(){
        frames=new ArrayList<MainFrame>();
        employees=new ArrayList<Employee>();
        tasks=new ArrayList<Work>();
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
    public ArrayList<Work> getTasks() {
        return tasks;
    }
    public void setTasks(ArrayList<Work> tasks) {
        this.tasks = tasks;
    }
}
