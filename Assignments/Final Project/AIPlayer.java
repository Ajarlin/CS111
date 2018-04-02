public class AIPlayer implements Player{
//do not change the line above	
	
	//Define your fields here
	   public int playerID;
	   public int rows;
	   public int cols;
	   public int lastMove=0; //starts at zero when the game begins
	   private Board Opponent;
	   int currentPlayer;
	
	//constructor takes the player id for this player, and the number of 
	//rows and columns of the board we're playing on
	public AIPlayer(int playerID, int row, int col){
		Opponent= new Board(row, col) ;
		this.rows=row;
	    this.cols=col;
		this.playerID=playerID;
		
		//Changes player 
		if(playerID == 1)
            currentPlayer=2;
        else{
            currentPlayer=1;}
		
	}
	
	//used to notify your AI player of the other players last move
	public void lastMove(int c) {
		Opponent.play(currentPlayer, c);	
	}
	
	//returns column of where to play a token
	public int playToken(){
		 int col;
	        for(col = 0; col< cols; col++)
	        	if(Opponent.play(playerID, col)){
	                return col;
	             }
	        return (cols/2)+1;
	}		 
		 	
	public int getPlayerID(){
		return playerID;
	}
	
	//resets the state of the player in preparation for a new game
	public void reset(){
		playerID=0;
		rows=0;
		cols=0;
		lastMove=0;
		Opponent = new Board(rows,cols);
	}

	
	}
