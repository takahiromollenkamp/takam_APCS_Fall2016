package textExcel;

public class TextCell implements Cell {

	private String content;
	public TextCell(String initial){
		content=initial;
	}
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
		return content;
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return content;
	}

}
