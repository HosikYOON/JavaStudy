package templateGameEx;

public class GameTest {

	public static void main(String[] args) {
		Player player = new Player();
		player.Play(1);

		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.Play(3);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.Play(5);
	}

}
