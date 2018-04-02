
public class Coordinate {
	private int row;
	private int column;
	
	public Coordinate(int inRow,int inColumn){
		row=inRow;
		column=inColumn;
	}
	
	public int getRow(){
		return row;
	}
	
	public int getColumn(){
		return column;
	}
	
	public void display(){
		System.out.println("("+getRow()+","+getColumn()+")");
	}
}
