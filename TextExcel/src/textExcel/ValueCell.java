package textExcel;

public class ValueCell extends RealCell {
	public ValueCell(String enter){
		super(enter);
		
		
		
	}
	public double getDoubleValue(){
		String ball=getCont();
		
		double kkkkkk=Double.parseDouble(ball);
		return kkkkkk;
	}
	public String abbreviatedCellText(){
		String ball=getCont();
		if(ball.indexOf(".")==-1){
			ball+=(".0");
		}
		ball+="               ";
		return ball.substring(0,10);
	}
	

}
