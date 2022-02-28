public class Player {

    public int overallScore;
    public String name;

    public Player() {

    }

    public Player(String name) {
        this.name = name;
    }

    public int getOverallScore() {
        return this.overallScore;
    }

    public void increaseScore(int amount) {
        this.overallScore += amount;
    }

    public void decreaseScore(int amount) {
        this.overallScore -= amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
