package abhinav;

public class Calculate {
	
	AddService service;
	
	public Calculate(AddService service) {
		this.service=service;
	}
	
	public int complexAdd(int i,int j){
		return service.add(i, j)*i;
	}
}
