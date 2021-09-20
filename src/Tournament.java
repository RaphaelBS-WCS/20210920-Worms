import java.util.Random;

public class Tournament {

    private static Worm wormOne;
    private static Worm wormTwo;
    private static Worm wormThree;
    private static Worm wormFour;
    private static Worm wormFive;
    public static Worm[] teamA = new Worm[]{wormOne, wormTwo, wormThree, wormFour, wormFive};

    private static Worm wormSix;
    private static Worm wormSeven;
    private static Worm wormEight;
    private static Worm wormNine;
    private static Worm wormTen;
    public static Worm[] teamB = new Worm[]{wormSix, wormSeven, wormEight, wormNine, wormTen};

    private static Integer wormALife = 10;
    private static Integer wormBLife = 10;
    private static final Integer attack = 10;

    public static void main(String[] args) {
        for (int i = 0; i < teamA.length ; i++){
            for (int j = 0; j < teamA.length ; j++) {
                if (Worm.match(teamA[i], teamB[j])) {
                    if (i < (teamA.length - 1) ) {
                        System.out.println("Team A player loose");
                        wormALife = 10;
                    } else {
                        System.out.println("teamA loose, teamB win!");
                    }
                } else {
                    if (j < (teamB.length -1)) {
                        System.out.println("Team B player loose");
                        wormBLife = 10;
                    } else {
                        System.out.println("teamB loose, teamA win!");
                    }
                }
            }
        }
        System.out.println("Next Tournament");
    }
}
