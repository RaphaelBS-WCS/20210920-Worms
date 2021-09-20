import java.util.Random;

public class Worm {

    private static Worm wormOne;
    private static Worm wormTwo;
    private static Integer wormOneLife = 10;
    private static Integer wormTwoLife = 10;

    public static void main(String[] args) {
        System.out.print(match(wormOne, wormTwo));
        /* if (match(wormOne, wormTwo)) {
            System.out.print("WormOne loose, WormTwo win!");
        } else {
            System.out.print("WormTwo loose, WormOne win!");
        } */
    }

    public static boolean match(Worm wormOne, Worm wormTwo) {
        while (wormOneLife < 0 || wormTwoLife < 0) {
            Integer attackPoint = 10;
            wormTwoLife = wormTwoLife - damages(attackPoint);
            System.out.print(wormTwoLife);
            wormOneLife = wormOneLife - damages(attackPoint);
            System.out.print(wormOneLife);
        }
        return wormOneLife.equals(0);
    }

    public static Integer damages(Integer attackpoint) {
        Random random = new Random();
        int nb;
        return random.nextInt(attackpoint);
    }
}
