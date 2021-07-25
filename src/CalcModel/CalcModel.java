package CalcModel;

public class CalcModel {
    private int calcValue;

	public int getCalcValue() {
		return calcValue;
	}
    public void add2Vals(int n1, int n2) {
        calcValue = n1+n2;
    }
}
