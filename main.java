public class main {
    public static void main(String[] args){
        //instance
        worm player1 = new worm();
        worm player2 = new worm();

        player1.userName = "vita";
        player1.score = 600;
        player1.lenght = 5.5;

        player2.userName = "eka";
        player2.score = 400;
        player2.lenght = 3.4;

        player1.eatSnack();

        System.out.println(player1.score);
        player1.eatOthers(player2);
        System.out.println(player1.score);
    }
}
