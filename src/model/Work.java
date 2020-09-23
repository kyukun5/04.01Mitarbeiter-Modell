package model;

public class Work {
    private int time;   //Duration of Work in Workhours
    private String infos;   //Details to task
    private int difficulty; //Difficulty on scale 1-10
    //TODO Klasse Work
    public Work(int time, String infos){
        this.time=time;
        this.infos=infos;
        this.difficulty=difficulty;
    }
    public String toString(){
        String h="";
        h="Does "+ infos+"currently;\nThis takes "+time+"time, because its";
        if(difficulty<=3){
            h=h+"very easy.";
        }
        if(difficulty<=6 && difficulty>3){
            h=h+"on average difficulty.";
        }
        if(difficulty>6){
            h=h+"very hard.";
        }
        return h;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getInfos() {
        return infos;
    }

    public void setInfos(String infos) {
        this.infos = infos;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}
