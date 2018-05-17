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
	
	public void noOfGames()
	{
		int count= game.length;
		
		if(count < 2)
		{
			System.out.println("Games Count: " + count);
			System.out.println("Enlisted Player can't play Less than TWO (2) Games");
		}
		else
			System.out.println("Games Count: " + count);
	}
	
	public void display()
	{
		for(int i=0 ; i < game.length ; i++)
		{
			
			System.out.println("Game Name: " + game[i].getGameName());
		}
	}
	


}
