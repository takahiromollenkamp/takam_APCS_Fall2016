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
		String[] spliff=command.split(" ");
		if(spliff[0].equals("clear")){
			if(spliff.length>1){
				SpreadsheetLocation low= new SpreadsheetLocation(spliff[1]);
				Cell change=getCell(low);
				change=new EmptyCell();
			}
			else{
				sheet=new Cell [20][12];
				for(int i=0; i<20; i++){
					for(int j=0; j<12;j++){
						sheet[i][j]=new EmptyCell();
					}
				}
			}
			return getGridText();
		}
		else if(spliff.length==1){
			SpreadsheetLocation low= new SpreadsheetLocation(spliff[0]);
			Cell aboutToInspect=getCell(low);
			return aboutToInspect.fullCellText();
		} else if(spliff[1].equals("=")){
			SpreadsheetLocation low= new SpreadsheetLocation(spliff[0]);
			
			Cell change=getCell(low);
			change=new TextCell(spliff[2]);
			return getGridText();
		}
		
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
		int a=loc.getRow();
		int b=loc.getCol();
		
		
		return sheet[a][b];
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
