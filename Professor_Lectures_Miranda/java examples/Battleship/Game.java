
public class Game {
	public static int getRow(String location){
		return 0;
	}
	
	public static int getColumn(String location){
		return 0;
	}
	
	public static void main(String[] args){
		int size=10;
		int white=1;
		int red=2;
		String[] shipTypes={"Carrier","Battleship","Cruiser","Submarine","Destroyer"};
		int[] shipSizes={5,4,3,3,2};
		Board myBoard = new Board(size);
		
		Ship[] ships=new Ship[5];

		for (int s=0;s<5;s++){
			boolean ok=false;
			do{	
				ships[s]=new Ship(shipTypes[s],shipSizes[s]);
				ok=ships[s].valid();
				if (ok){
					for (int s1=0;s1<s;s1++){
						if (ships[s].overlap(ships[s1]))
							ok=false;
					}
				}
			}while(!ok);			
			ships[s].show(myBoard, red);
		}
//		myBoard.peg(5, 5, white);
//		myBoard.peg(4, 3, red);

	}
}
