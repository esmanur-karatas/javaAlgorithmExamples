
public class FootballPlayer {
	int no, minutes, numberOfGoals, play, score;
	String name;
	boolean inPlay;

	void play(int minutesToPlay) {
		minutes += minutesToPlay;
	}

	void score() {
		numberOfGoals++;
	}

}
