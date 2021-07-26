package application.CalcModel;

public class CalcModel {
    private static int calcValue;

	public static int getCalcValue() {
		return calcValue;
	}
    public static void add2Vals(int n1, int n2) {
        calcValue = n1+n2;
    }
    public static void multiply2Vals(int n1, int n2) {
        calcValue = n1*n2;
    }
}
