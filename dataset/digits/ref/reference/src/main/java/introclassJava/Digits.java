package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class Digits {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		Digits mainClass = new Digits();
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
        IntObj j = new IntObj(), k = new IntObj();
        output += (String.format("\nEnter an integer > "));
        j.value = scanner.nextInt();
        while(Math.abs(j.value) >= 10){
            k.value = j.value % 10;
            output += (String.format("\n%d", Math.abs(k.value)));
            j.value = j.value / 10;
        }
        ;
        output += (String.format("\n%d", j.value));
        output += (String.format("\nThat's all, have a nice day!\n"));
        if(true)return;;
    }
}