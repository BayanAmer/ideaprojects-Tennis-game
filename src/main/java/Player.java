public class Player {
    private int point=0;
    private int score=0;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void addOneScore() {
        this.score++;
    }
}

