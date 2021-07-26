package application.CalcModel;

public class CalcModel {
    private static Double calcValue;

	public static Double getCalcValue() {
		return calcValue;
	}
    public static void add2Vals(Double n1, Double n2) {
        calcValue = n1+n2;
    }
    public static void multiply2Vals(Double n1, Double n2) {
        calcValue = n1+n2;
    }
}
