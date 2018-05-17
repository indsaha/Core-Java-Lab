package gameplay;

public class PlayerEntry {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Game games[] = new Game[4];
		 Game game = new Game();
		//Player1
		Player players = new Player();
		players.setName("R.K Prithwijit");
		games [count] = new Game();
		games[count++].setGameName("Volley");
		
		games [count] = new Game();
		games[count++].setGameName("cricket");
		
		games [count] = new Game();
		games[count++].setGameName("Football");
		
		games [count] = new Game();
		games[count].setGameName("Chess");
		
		players.setGame(games);
		System.out.println("Name: " + players.getName());
		/*Game games4[]=players.getGame();
		
		for(int i=0;i<games4.length;i++)
		{
		System.out.println(games4[i].getGameName());
		}*/
		players.noOfGames();
		players.display();
		
		
		
//		//Player2
		count=0;
		Player players1 = new Player();
	
		Game games1[] = new Game[2];
		 //Game game1 = new Game();
		players1.setName("R.K Indrajit");
		games1 [count] = new Game();
		games1[count++].setGameName("Kabadi");
		
		/*games1 [count] = new Game();
		games1[count++].setGameName("Ludo");
		
		games1 [count] = new Game();
		games1[count++].setGameName("Football");*/
		
		games1 [count] = new Game();
		games1[count].setGameName("Chess");
		
		players1.setGame(games1);
		System.out.println("\n");
		System.out.println("Name: " + players1.getName());
		players1.noOfGames();
		players1.display();
		
		
		//Player2
				count=0;
				Player players2 = new Player();
			
				Game games2[] = new Game[3];
				 //Game game1 = new Game();
				players2.setName("Rudrajit");
				games2 [count] = new Game();
				games2[count++].setGameName("Volley");
				
				games2 [count] = new Game();
				games2[count++].setGameName("Javlin");
				
				games2 [count] = new Game();
				games2[count].setGameName("Table Tennis");
				
				/*games2 [count] = new Game();
				games2[count].setGameName("Chess");*/
				
				players2.setGame(games2);
				System.out.println("\n");
				System.out.println("Name: " + players2.getName());
				players2.noOfGames();
				players2.display();
				
				
				//Player3
				count=0;
				Player players3 = new Player();
			
				Game games3[] = new Game[4];
				 //Game game1 = new Game();
				players3.setName("Indranil");
				games3 [count] = new Game();
				games3[count++].setGameName("Billiyard");
				
				games3 [count] = new Game();
				games3[count++].setGameName("Khoko");
				
				games3[count] = new Game();
				games3[count++].setGameName("Football");
				
				games3 [count] = new Game();
				games3[count].setGameName("Golf");
				
				players3.setGame(games3);
				System.out.println("\n");
				System.out.println("Name: " + players3.getName());
				players3.noOfGames();
				players3.display();
				
				
				//Player4
				count=0;
				Player players4 = new Player();
			
				Game games4[] = new Game[1];
				 //Game game4 = new Game();
				players4.setName("Arup");
				games4 [count] = new Game();
				games4[count].setGameName("Table Tennis");
				
				players4.setGame(games4);
				System.out.println("\n");
				System.out.println("Name: " + players4.getName());
				players4.noOfGames();
				players4.display();
				
		/*
		System.out.println("Name: " + players.getName());
		for(int i=0 ; i < games.length ; i++)
		{
			
			System.out.println("Game Name: " + games[i].getGameName());
		}*/
		
		

	}

}
