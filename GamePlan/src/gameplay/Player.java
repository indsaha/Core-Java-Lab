package gameplay;

public class Player {
	private String name;
	private Game game [];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Game[] getGame() {
		return game;
	}
	public void setGame(Game[] game) {
		this.game = game;
	}
	
	public void display()
	{
		for(int i=0 ; i < game.length ; i++)
		{
			
			System.out.println("Game Name: " + game[i].getGameName());
		}
	}
	


}
