public class Tennis {
    Player player1;
    Player player2;
    private String stateArr[]={"Love","Fifteen","Thirty","Forty"};

    public Tennis(Player p1, Player p2){
        setPlayer1(p1);
        setPlayer2(p2);
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Player getPlayer2() {
        return player2;
    }

    public String updateParticipantPoints(int p1, int p2){

        player1.setPoint(p1);
        player2.setPoint(p2);
        String res="";

        if (p1 <= 3 && p2 <= 3){
            res=stateArr[p1]+"-"+stateArr[p2];
            if(p1 == p2 && p1 == 3)
                res = "Deuce";
        }else{
            if (p1-p2>=2) {
                res = "Win for player1";
                      player1.addOneScore();
                      player1.setPoint(0);
                      player2.setPoint(0);
            }
            else if(p2-p1>=2) {
                res = "Win for player2";
                player2.addOneScore();
                player1.setPoint(0);
                player2.setPoint(0);
            }

            if (p1-p2==1)
                res = "Advantage player1";
            else if(p2-p1==1)
                res = "Advantage player2";

            if (p1 == p2)
                res = "Deuce";

        }


        return  res;

    }



}
