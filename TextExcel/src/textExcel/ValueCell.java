package textExcel;

public class ValueCell extends RealCell {
	public ValueCell(String enter){
		super(enter);
	}
	public double getDoubleValue(){
		String ball=getCont();
		content.substring(1, content.length()-1);
		double kkkkkk=Double.parseDouble(ball);
		return kkkkkk;
	}

}
