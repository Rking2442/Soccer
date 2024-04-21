import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Game {
    static Scanner sc;
    static int shotChoice;
    static int saveChoice;
    static int score;
    static int shotChoice2;
    static int saveChoice2;
    static int score2;
    static String player1;
    static String player3;
    static List<String> soccerPlayers = new ArrayList<String>();
    String[] array = new String[]{"Messi", "Ronaldo", "Neymar", "Van Dijk", "De Jong"};





    Game() throws InterruptedException {
        Thread thread = new Thread();
        startGame();
        while (score < 5 || score2 < 5) {
            shoot();
            save();
            if (shotChoice > 3) {
                System.out.println("Not Allowed...");
                shoot();
            } else if (saveChoice > 3) {
                System.out.println("Not Allowed...");
                save();

            }

            if (score == 3 || score2 == 3) {
                System.out.println("Half Time Break, Players Cooling Down! Back in 20");
                for (int i = 20; i > 0; i --) {
                    if (i < 6) {
                        System.out.println(i);
                    }
                }
                thread.sleep(20000);
            }
            if (shotChoice == saveChoice) {
                System.out.println("Shot Has Been Blocked!");
            } else if (shotChoice != saveChoice) {
                System.out.println("Goal!");
                score++;
            }
            if (score > 4) {
                System.out.println(player1 + " Has Achieved 5 Goals & Won!");
            } else if (score2 > 4) {
                System.out.println("Player 2 Has Achieved 5 Goals & Won!");
            }
            shoot2();
            save2();
            if (shotChoice2 > 3) {
                System.out.println("Not Allowed...");
                shoot();
            } else if (saveChoice2 > 3) {
                System.out.println("Not Allowed...");
                save();

            }
            if (score == 3 || score2 == 3) {
                System.out.println("Half Time Break, Players Cooling Down! Back in 20");
                thread.sleep(20000);
            }
            if (shotChoice2 == saveChoice2) {
                System.out.println("Shot Has Been Blocked");

            } else if (shotChoice2 != saveChoice2) {
                System.out.println("Goal, Player 2!");
                score2++;
            }
            if (score > 4) {
                System.out.println(player1 + " Has Achieved 5 Goals & Won!");
            } else if (score2 > 4) {
                System.out.println("Player 2 Has Achieved 5 Goals & Won!");
            }
            }
        endGame();
        Interview();

    }

    public static void startGame() {
        System.out.println("Your Game Has Started\n\nScore 5 Goals To Win");
        Scanner player = new Scanner(System.in);
        System.out.println("What Is Your Name Player 1?");
        player1 = player.next();

        Scanner player8 = new Scanner(System.in);
        System.out.println("What Is Your Name Player 2?");
        player3 = player8.next();


    }

    public static void shoot() {
        int[] array = new int[]{1, 2, 3};
        sc = new Scanner(System.in);

        System.out.print("\n\nShoot " + player1 + " (1, 2, 3): ");
        shotChoice = sc.nextInt();


    }
    public static void shoot2() {
        int[] array3 = new int[]{1, 2, 3};
        Scanner sc3 = new Scanner(System.in);

        System.out.print("Shoot " + player3 + " (1, 2, 3): ");
        shotChoice2 = sc3.nextInt();


    }

    public static void save() {
        int[] array1 = new int[]{1, 2, 3};
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Save " + player3 + " (1, 2, 3): ");
        saveChoice = sc1.nextInt();


    }
    public static void save2() {
        int[] array4 = new int[]{1, 2, 3};
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Save " + player1 + " (1, 2, 3): ");
        saveChoice2 = sc4.nextInt();


    }


    public static void endGame() {
        System.out.println("Game Has Ended");
        if (score > score2) {
            System.out.println(player1 + " Has Won");
        } else if (score2 > score) {
            System.out.println(player3 + " Has Won");
        }

    }
    public static void Interview() {
        Scanner interview = new Scanner(System.in);
        Scanner interview2 = new Scanner(System.in);
        System.out.println("Player 1, How Did You Feel About Your Team?");
        String interview3 = interview.next();
        System.out.println(player3 + ", Did you feel your teams energy today?");
        String interview4 = interview2.next();
        if (score > score2) {
            System.out.println(player1 + ", Was the win deserved?");
        } else if (score2 > score) {
            System.out.println(player3 + ". was the win deserved?");
        }
        System.out.println("I disagree, the win belonged to the other team tonight...");
    }
    public static void gift() {


        List<String> player1Array = new ArrayList<String>();
        List<String> player2Array = new ArrayList<String>();
        int rando = 0;
        if (score > score2) {
            System.out.println("Here's A Gift " + player1);
            rando = 0;
            while (rando < 5) {
                rando = (int) Math.random();
            }
            player1Array.add(soccerPlayers.get(rando));
        } else if (score2 > score) {
            System.out.println("Here's A Gift " + player3);
            player2Array.add(soccerPlayers.get(rando));

        }


    }
}
