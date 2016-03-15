package araay;

public enum Ennum {
	eric("student","kenyan","22"),
	otieno("worker","ugandan","30"),
	odhiambo("enginer","ugenyan","20"),
	mark("obidient","western","19");
	
	private final String profesion;
	private final String nationality;
	private final String age;
	
	Ennum(String pro,String nat,String ag){
	profesion=pro;
	nationality=nat;
	age=ag;	
	}
	
public String getprofesion(){
	return profesion;
}
public String getnational(){
	return nationality;
}
public String getage(){
	return age;
}

}
