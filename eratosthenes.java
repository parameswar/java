import java.util.ArrayList;
class sample {
	public static void main(String [] args) {
		int prime = 2;int s = 0;
		ArrayList<Integer> myarr = new ArrayList<Integer>();
		int i = 0;
		for(i=2;i<103;i++){
			myarr.add(i);
		}
		i = 0;
		while(prime*prime < 103) {
			for(int index = myarr.indexOf(prime)+1;index<(myarr.size());index++) {
				if ( ( myarr.get(index) % prime == 0)) {
					myarr.remove(index);
				}
			}
		s+=1;
		prime = myarr.get(s);
		}
		while(i<myarr.size()) {
			System.out.println(myarr.get(i));
			i++;
	
		}	
	}
}
	
	


