package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class Grade {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		Grade mainClass = new Grade();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public void exec () throws Exception {
        DoubleObj aval = new DoubleObj(), bval = new DoubleObj(), cval = new DoubleObj(), dval = new DoubleObj(), score = new DoubleObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        aval.value = scanner.nextDouble();
        bval.value = scanner.nextDouble();
        cval.value = scanner.nextDouble();
        dval.value = scanner.nextDouble();
        output += (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextDouble();
        if(score.value >= aval.value){
            output += (String.format("Student has an A grade\n"));
        } else if(score.value >= bval.value){
            output += (String.format("Student has an B grade\n"));
        }         else if(score.value >= cval.value){
            output += (String.format("Student has an C grade\n"));
        }         else if(score.value >= dval.value){
            output += (String.format("Student has an D grade\n"));
        }         else {
            output += (String.format("Student has failed the course\n"));
        }
        if(true)return;;
    }
}