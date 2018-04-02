//Project Milestone PT.2
public class Board {

	//Variables 
    private char[][] board;
    private int row;
    private int col;
    private char playerOne;
    private char playerTwo;
    static int amount;
	public int playCount;

    
    /*Constructors*/
    
    //fill board() by 6x
    Board() {
    	//this(6,7);
    	this.row=6;
    	this.col=7;
        board = new char[row][col];
        amount=6*7;
        for(int rows = 0; rows<board.length; rows++){
        	for(int cols=0; cols<board[rows].length;cols++){
        		board[rows][cols]=' ';
        	}
        }
  
    }

    Board(int row, int col) {
        this.row = row;
        this.col = col;
        amount=row*col;
        board = new char[row][col];
        for(int rows = 0; rows<board.length; rows++){
        	for(int cols=0; cols<board[0].length;cols++){
        		board[rows][cols]=' ';
        	}
        }
    }

    /*Methods*/
    
    public int getNumRows() {
        return this.row;
    }

    public int getNumCols() {
        return board[0].length;
    }

    public char getPlayerOne() {
        return this.playerOne;
    }

    public char getPlayerTwo() {
        return this.playerTwo;
    }

    public void setPlayerOne(char o) {
        this.playerOne = o;
    }

    public void setPlayerTwo(char t) {
        this.playerTwo = t;
    }

    //returns the char representing token at location row,col
    public char getToken(int row, int col) {
    	if((row>=0 && row<this.getNumRows())&& (col>=0&&col<this.getNumCols())){
			return board[row][col];
		}else{
			return '\0';
		}
    }
    
  //returns true if a token is still able to placed onto the board, false otherwise
    public boolean canPlay() {
        for (int i = 0; i < getNumRows(); i++) {
            for (int j = 0; j <getNumCols(); j++) {
                if (board[i][j]==' ') {
                    return true;
                }
            }
        }
        return false;
    }

    
     //p is the player number input
     //c is the column number input, where the play is made
    public boolean play(int p, int c) {
    	playCount++;
        for (int i = board.length-1; i>= 0; i--) {
            if (board[i][c]== ' ' && (c>=0 && c<board[0].length)) {
                if (p==1) {
                    board[i][c] = this.playerOne;
                    return true;
                } 
                else if (p==2) {
                    board[i][c] = this.playerTwo;
                    return true;
                }
            }
        }	
        return false;
    }
// Have to check for column, vertical, and Diagonally
    // Column: LEFT to RIGHT
    // Vertical: TOP to DOWN
    // Diagonally: POSTIVE SLOPE(Bottom left-right Top) and NEGATIVE SLOPE(Top left-right Bottom) 
    // Check if every play is possible, compare and evaluate
    public int isFinished() {
    	boolean winner = true;
    	
    	
		for (int i = 0; i<this.board.length; i++){ //rows
			for(int j=0; j<this.board[0].length; j++){ //cols
				for(int k=1;k<4;k++){
					
					
				if(this.getToken(k, j)!=this.getToken(i-k, j)){
						winner = false;
						break;
					}
				}
				
				if(winner == true){
					if(this.getToken(i, j)==this.getPlayerOne()){
						return 1;
					}
					else if(this.getToken(i, j)==this.getPlayerTwo()){
						return 2;
						
					}
				}
				winner = true;
				for(int k =1;k<4;k++){
					if(this.getToken(i, j)!=this.getToken(k+i, j)){
						winner = false;
						break;
						
					}
				}
				
				if(winner == true){
					if(this.getToken(i, j)==this.getPlayerOne()){
						return 1;
					}
					else if(this.getToken(i, j)==this.getPlayerTwo()){
						return 2;
						
					}
				}
				winner= true;
				for(int k = 1;k<4;k++){
						if(this.getToken(i, j)!=this.getToken(i, j-k)){
							winner = false;
							break;
						}
					}
				
				if(winner ==true){
						if(this.getToken(i, j)==this.getPlayerOne()){
							return 1;
						}
						else if(this.getToken(i, j)==this.getPlayerTwo()){
							return 2;
					}
				}
					winner = true;
					for(int k= 1; k<4;k++){
						if(this.getToken(i, j)!=this.getToken(i-k, j+k)){
							winner = false;
							break;
							
						}
					}
					
				if(winner==true){
						if(this.getToken(i, j)==this.getPlayerOne()){
							return 1;
						}
						else if(this.getToken(i, j)==this.getPlayerTwo()){
							return 2;
						}
					}
					winner = true;
					for(int k =1;k<4;k++){
						if(this.getToken(i, j)!=this.getToken(i+k, j-k)){
							winner= false;
							break;
						}
					}
					if(winner == true){
						if(this.getToken(i, j)==this.getPlayerOne()){
							return 1;
						} 
						else if(this.getToken(i, j)==this.getPlayerTwo()){
							return 2;
						}
					}
					winner = true;
					for ( int k = 1;k<4;k++){
						if(this.getToken(i, j)!=this.getToken(i+k, j+k)){
							winner = false;
							break;
						}
					}
					if(winner==true){
						if(this.getToken(i, j)==this.getPlayerOne()){
							return 1;
							
						}
						else if(this.getToken(i, j)==this.getPlayerTwo()){
							return 2;
						}
					}
			}
			
		} 
		if(this.canPlay()==true ){
			return -1; //If a play can be made
		} 
		else  {
			return 0; //if its a draw
		}
		
	}

    
    
    
    /* OLD METHOD FOR WINNING only works on 6by7 stage
     *  boolean winner = false;
     *  Changed didnt meet custom board
    
    
     * // check for a horizontal win 
    for (int row=0; row<6; row++) { 
      for (int column=0; column<4; column++) { 
        if (grid[column][row]!= 0 && grid[column][row] == grid[column+1][row] && 
        grid[column][row] == grid[column+2][row] && grid[column][row] == grid[column+3][row]) { 
          winner=true; 
            }        
 }      
 }
 
 
  // vertical win 
    for (int row=0; row<3; row++) { 
      for (int column=0; column<7; column++) { 
        if (grid[column][row] != 0 &&  grid[column][row] == grid[column][row+1] && 
            grid[column][row] == grid[column][row+2] && grid[column][row] == grid[column][row+3]) 
            { 
          		winner=true; 
            }        
 }       }    
     
    //diagonal win (positive slope) 
    for (int row=0; row<3; row++) { 
      for (int column=0; column<4; column++) { 
        if (grid[column][row] != 0 && grid[column][row] == grid[column+1][row+1] && 
            grid[column][row] == grid[column+2][row+2] && grid[column][row] == grid[column+3][row+3])
             { 
          		winner=true; 
            }        
 }      
 }    
     
    //diagonal win (negative slope) 
    for (int row=3; row<6; row++) { 
      for (int column=0; column<4; column++) { 
        if (grid[column][row] != 0 && grid[column][row] == grid[column+1][row-1] && 
            grid[column][row] == grid[column+2][row-2] && grid[column][row] == grid[column+3][row-3]) 
            { 
          		winner=true; 
            }        
 }      
 }    
     
    return winner; 
 }  
   
     * 
     */
    public static void main(String[] args) {
    	System.out.println("Welcome to connect 4 game");
    	//int a =IO.readInt();
    	//int b =IO.readInt();
    	//Board stage = new Board(a,b);
       Board stage = new Board();
        stage.setPlayerOne('X');
        stage.setPlayerTwo('O');
  
		stage.play(1, 1);
		stage.play(1, 1);
		stage.play(2, 1);
		stage.play(1, 1);
		stage.play(2, 1);
		stage.play(1, 1);
		
		stage.play(1, 2);
		stage.play(1, 2);
		stage.play(2, 2);
		stage.play(1, 2);
		stage.play(2, 2);
		stage.play(1, 2);
		
		stage.play(2, 3);
		stage.play(2, 3);
		stage.play(1, 3);
		stage.play(2, 3);
		stage.play(1, 3);
		stage.play(2, 3);
		
		stage.play(2, 4);
		stage.play(2, 4);
		stage.play(1, 4);
		stage.play(2, 4);
		stage.play(1, 4);
		stage.play(2, 4);
		
		stage.play(1, 5);
		stage.play(1, 5);
		stage.play(2, 5);
		stage.play(2, 5);
		stage.play(2, 5);
		stage.play(1, 5);
		
		stage.play(1, 6);
		stage.play(2, 6);
		stage.play(1, 6);
		stage.play(1, 6);
		stage.play(1, 6);
		stage.play(2, 6);

		
		
		
		System.out.println("Finished: " + stage.isFinished());
		//System.out.println(stage.diagonalCheck());
		
		for(int i = 0; i < stage.board.length; i++){
			for(int j = 0; j < stage.board[i].length; j++){
			System.out.print(stage.board[i][j] + "_|_");
			}
			System.out.println("");
		}
		
/*         for(int allTokens=0; allTokens<amount; allTokens++){
        	//System.out.println(amount);
        	
        	int currentPlay=IO.readInt();
        	stage.play(currentPlayer, currentPlay);
        	for(int bot=0; bot<stage.col; bot++){
        		System.out.println("__");
        	}
        	System.out.println("");
        	for(char[]x: stage.board){
        		String filler ="|_";
        		for(char y:x)
        			filler+=y+"_|_";
        		System.out.println(filler.substring(0,filler.length()-1));
        	}
        	//Starts checking if theirs a winner
        	if(allTokens>=4){
        		if(stage.isFinished()== 1 || stage.isFinished()==2){
        		 System.out.println("The winner is: " + stage.isFinished());
        	}
        		else if(stage.isFinished()==0 && allTokens==amount-1){
        			System.out.println("Its a draw: " + stage.isFinished());
        		}
        		else{
        			System.out.print("Nobody has won yet. Keep it going!");
        			System.out.println();
        		}
        }
        	
        	//changes player

        	if(currentPlayer==1){
        		currentPlayer=2;
        		System.out.print("Player: " + currentPlayer + " it's your turn.");
        	}
        	else{
        		currentPlayer=1;
        		System.out.print("Player: " + currentPlayer + " it's your turn.");
        	}
        	} */
 
    }
    
}