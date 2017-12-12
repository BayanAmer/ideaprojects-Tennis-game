import spock.lang.Specification

class PlayerTest extends Specification{
    def "#setPoint set the point in player "(){

        given: "player with 0 points"
        Player player=new Player()

        when: "#setPoint"
        player.setPoint(1)

        then: "player point is 1"

        player.getPoint() == 1
    }

    def "#setScore set the score in player "(){

        given: "player with 0 score"
        Player player=new Player()

        when: "#setScore"
        player.setPoint(1)

        then: "player score is 1"

        player.getPoint() == 1
    }


}
