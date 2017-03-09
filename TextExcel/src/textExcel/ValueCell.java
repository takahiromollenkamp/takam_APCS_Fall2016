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

}
