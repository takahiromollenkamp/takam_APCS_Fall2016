package textExcel;

public class FormulaCell extends RealCell {
	public FormulaCell(String enter){
		super(enter);
	}
}



/*if(spliff.length>3){
if(spliff[3].toUpperCase().equals("AVG")){
	String[] whichCell=spliff[4].split("-");
	SpreadsheetLocation start=new SpreadsheetLocation(whichCell[0]);
	SpreadsheetLocation finish = new SpreadsheetLocation(whichCell[1]);
	int counter=0;
	for(int i=start.getRow(); i<finish.getRow(); i++){
		for(int j=start.getCol(); j<finish.getRow();j++){
			sheet[i][j]=new EmptyCell();
		}
	}
	
	
}
if(spliff[3].toUpperCase().equals("SUM")){}

//D4 = ( avg B3-C4 )

} */