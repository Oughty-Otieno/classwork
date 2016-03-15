package araay;
import java.util.EnumSet;
public class Enum2 {
	public static void main(String args[]){
		for (Ennum people:Ennum.values())
			System.out.printf("%s\t%s\t%s\t%s\n",people,people.getprofesion(),people.getnational(),people.getage());
		System.out.println();
		for(Ennum peopl:EnumSet.range(Ennum.eric,Ennum.odhiambo))
			System.out.printf("%s\t%s\t%s\t%s\n",peopl,peopl.getprofesion(),peopl.getnational(),peopl.getage());

		}
		}
		



