package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        calculateScore(true,800, 5, 100);

        calculateScore(true, 10000,8,200);

//        if(score < 5000 && score >1000){
//            System.out.println("Your score was less than 5000 but greater than 1000.");
//        }
//        else if (score <1000){
//            System.out.println("Your score was less than 1000.");
//        }
//        else {
//            System.out.println("Got here.");
//        }
        /*if (gameOver) { // similar cu if(gameOver == true)
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was: " + finalScore);

        }*/
//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//        if (newGameOver) { // similar cu if(gameOver == true)
//            int newFinalScore = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your new final score was: " + newFinalScore);
//        }

//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;

//        if (gameOver) { // similar cu if(gameOver == true)
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was: " + finalScore);
//
//        }
    }

    public static void  calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver) { // similar cu if(gameOver == true)
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was: " + finalScore);

        }
    }

}
