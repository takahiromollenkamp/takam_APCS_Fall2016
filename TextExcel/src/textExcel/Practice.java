package textExcel;

import textExcel.TestsALL.Helper;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Spreadsheet go=new Spreadsheet();
		 String stringSpecial1 = "A1 = ( avg A2-A3 )";
         String stringSpecial2 = "A1 = ( 1 * 2 / 1 + 3 - 5 )";
         Helper helper = new Helper();
         String grid1 = go.processCommand("B7 = \"" + stringSpecial1 + "\"");
		
		System.out.println(go.getGridText());
	}

}
