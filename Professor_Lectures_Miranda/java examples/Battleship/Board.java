
import javax.swing.*;
import java.awt.*;

public class Board extends JFrame{
    private JLabel[][] boardLabels;
    ImageIcon[] myIcon=new ImageIcon[3];    
    
     public Board(int boardSize){
    	JPanel keyboardPanel;
    	JLabel square;
        boardSize+=2;
    	setTitle("Board");
    	setSize(45*boardSize,45*boardSize);
    	setLocation(50,50);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);

    	Container calContentPane = getContentPane();
    	keyboardPanel = new JPanel();
    	keyboardPanel.setLayout(new GridLayout(boardSize,boardSize));
    	boardLabels=new JLabel[boardSize][boardSize];
    
        myIcon[0]=new ImageIcon("hole.jpg");
    	myIcon[1]=new ImageIcon("whitepeg.jpg");
    	myIcon[2]=new ImageIcon("redpeg.jpg");

    	
    	for (int i=0;i<boardSize;i++)
    		for (int j=0;j<boardSize;j++)	
    		{
    			String lname="";
    			if (i==0 && j>0 && j<boardSize-1)
    				lname=""+j;
    			if (j==0 && i>0 && i<boardSize-1)
    				lname=""+(char)(i+64);
    				
    			square = new JLabel(lname);
    			square.setVerticalAlignment(JLabel.CENTER);
    			square.setHorizontalAlignment(JLabel.CENTER);
    			boardLabels[i][j]=square;
    			if (i>0 && i<boardSize-1 && j<boardSize-1 && j>0){
    				boardLabels[i][j].setIcon(myIcon[0]);
    			}
    			keyboardPanel.add(square);
    		}

    	calContentPane.add(keyboardPanel);
    	this.show();
    }
    public void peg(int row,int col,int peg)
    {
    	boardLabels[row][col].setIcon(myIcon[peg]);
    }    
    

}
