package textExcel;

public class EmptyCell implements Cell {

	
	private String inside;
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
		return inside;
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return "";
	}
    public EmptyCell(){
    	inside="          ";
    }
}
