public class Meh{

    public static void main(String[] args){

	
	int meh = 0;
	for (int i = 0; i < 10 ; i++){
	    for (int j = 0; j < 10 ; j++){
		for (int k = 0; k < 10 ; k++){
		    if (2 * i + j >= k * 3){
			meh++;
		    }
		}
	    }
	}
	System.out.println(meh);
    }
}