package debugger;
public class DebuggerTester {

	public static void main(String[] args) {
		Debugger f = new Debugger("3/4");
		Debugger g = new Debugger("1/5");
		Debugger[] myFractions = new Debugger[5];
		
		// Add the fractions, store the result
		Debugger sum = f.add(g);
		
		myFractions[0] = f;
		myFractions[1] = g;
		myFractions[4] = sum;
		
		// Print the result
		System.out.println(myFractions[4].toPrettyString());

	}
}