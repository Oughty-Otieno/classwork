package araay;

public class Montecarlo {
	public static void main (String[] args){
		double b =(22/7);
		double a =0;
		double total1=0;
		double total2=0;
		double total3=0;
		double total4=0;
		double total5=0;
		
	for(int i=1;i<=10;i++){
		double x=Math.random();
		double r=Math.sin((a+x*(b-a)));
			total1=total1 +r;
		} 
	double value1=((total1/10)*(b-a));
	for(int i=1;i<=20;i++){
		double x=Math.random();
		double r=Math.sin(a+(x*(b-a)));
		total2=total2 +r;
	}
	double value2=((total2/20)*(b-a));
	for(int i=1;i<=40;i++){
		double x=Math.random();
		double r=Math.sin((a+x*(b-a)));
		total3=total3 +r;
	}
	double value3=((total3/40)*(b-a));
	for(int i=1;i<=80;i++){
		double x=Math.random();
		double r=Math.sin((a+x*(b-a)));
		total4=total4 +r;
	}
	double value4=((total4/80)*(b-a));
	for(int i=1;i<=160;i++){
		double x=Math.random();
		double r=Math.sin((a+x*(b-a)));
		total5=total5 +r;
	}
	double value5=((total5/160)*(b-a));
	
	System.out.println("n:" + " \t \t"+10+ "\t \t \t"+20+ "\t \t \t" +40+ "\t \t \t"+80+"\t \t \t"+160);
	System.out.println("values:" + "\t"+value1+ "\t " +value2+ "\t" +value3+"\t"+value4+"\t"+value5);
}
}