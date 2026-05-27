package SpotTheDifference;

public abstract class  SpotTheDifference {

    //attributes
    private String name;
    private int life;
    private int round;
    private int time;
    private int score;
    private int difference;

    //methods
    //getters
    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getRound() {
        return round;
    }

    public int getTime() {
        return time;
    }

    public int getScore() {
        return score;
    }

    public int getDifference() {
        return difference;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }
    //This method returns 2 images from 2 different lists
    public int randomImage(int n){
        return 1;
    }

    //takes the coordinates when clicked and compares to the position of the differences.
    //for each image there will be 5 differences. Each image has a list of coordinates (of the diff)
    //if click is within x pickels score will go up or down.
    public void distanceCheck(){

    }
}

