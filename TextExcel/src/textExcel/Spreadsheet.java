package textExcel;
//Takahiro Mollenkamp 3/3/17

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private Cell[][] sheet;
	
	public Spreadsheet(){
		sheet=new Cell [20][12];
		for(int i=0; i<20; i++){
			for(int j=0; j<12;j++){
				sheet[i][j]=new EmptyCell();
			}
		}
	}
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public int getRows()
	{
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int getCols()
	{
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText()
	{
		String griddy="   ";
		for(char kkk='A'; kkk<='L'; kkk++){
			griddy+="|"+kkk+"         ";
		}
		griddy+="|\n";
		for(int i=0;i<20;i++){
			String n=(i+1)+"   ";
			griddy+=n.substring(0, 3);
			for(int j=0;j<12;j++){
				griddy+="|";
				String s =sheet[i][j].abbreviatedCellText();
				griddy+=s;
			}
			griddy+="|\n";	
		}
		// TODO Auto-generated method stub
		return griddy;
	}

}
