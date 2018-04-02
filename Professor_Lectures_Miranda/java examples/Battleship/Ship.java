
public class Ship {
	private String type="";
	private int length=0;
	private int hits=0;
	private Coordinate[] pos;
	
	public String getType(){
		return "";
	}
	
	public boolean shot(int inRow,int inCol){
		return false;
	}
	
	public boolean sunk(){
		return false;
	}
	
	public int random(int min,int max){
		int r=(int)(Math.random()*(max-min));
		r=r+min;
		return r;
	}
	
	public void show(Board board,int inColor){
		for (int l=0;l<length;l++){
			board.peg(pos[l].getRow(), pos[l].getColumn(), inColor);
		}
	}
	
	public void display(){
	}
	
	public Ship(String inType,int inLength){
		type=inType;
		length=inLength;
		int di=0;
		int dj=0;
		int i=random(1,10);
		int j=random(1,10);
		di=random(0,2);
		pos=new Coordinate[inLength];
		if (di==0)
			dj=1;
		else
			dj=0;
		for (int l=0;l<length;l++){
			pos[l]=new Coordinate(i,j);
			i+=di;
			j+=dj;
		}
   }
	
	public boolean valid(){
		for (int l=0;l<length;l++){
			if (pos[l].getColumn()<1 || pos[l].getColumn()>10 || pos[l].getRow()<1 || pos[l].getRow()>10)
				return false;
		}
		return true;
	}
	
	public boolean overlap(Ship ship2){
		for (int l1=0;l1<length;l1++){ // l1 length of this ship
			for (int l2=0;l2<ship2.length;l2++){
				if (pos[l1].getColumn()==ship2.pos[l2].getColumn() &&
					pos[l1].getRow()==ship2.pos[l2].getRow())
					return true;
			}
		}
		return false;
	}
}
