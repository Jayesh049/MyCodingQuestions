class Main2{

public static void main(String[] args) {

        calculateScore(true, 500, 8, 200);



    calculateScore(true,900, 9, 800);


}

public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
        int finalScore = score + (levelCompleted * bonus);
        finalScore += 2000;
        System.out.println("Your final score was " + finalScore);
        return finalScore;
        }

        return -1;

        }

        }