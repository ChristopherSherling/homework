public class ClassWork{

    public static void allF(){
	for(int i = 1; i < 21; i++){
	    System.out.println(i);
	}
    }
    public static void allW(){
	int i = 1;
	while(i < 21){
	    System.out.println(i);
	    i = ++i;
	}
    }
    public static void allFE(){
	for(int i = 1; i < 21; i++){
	    if (i % 2 == 0)
		System.out.println(i);
	}
    }
    public static void allWE(){
	int i = 1;
	while(i < 21){
	    if (i % 2 == 0)
		System.out.println(i);
	    i = ++i;
	}
    }
    public static void allFThree(){
	for(int i = 1; i < 21; i++){
	    if (i % 3 == 0)
		System.out.println(i);
	}
    }
    public static void allWThree(){
	int i = 1;
	while(i < 21){
	    if (i % 3 == 0)
		System.out.println(i);
	    i = ++i;
	}
    }
    public static void allFOS(){
    	for(int i = 1; i < 21; i++){
    	    if (i % 2 == 1)
    		System.out.println(i * i);
    	}
    }
    public static void allWOS(){
    	int i = 1;
    	while(i < 21){
    	    if (i % 2 == 1)
    		System.out.println(i * i);
    	    i = ++i;
    	}
    }
    public static void allFSign(){
    	for(int i = 1; i < 21; i++){
    	    if (i < 20)
    		System.out.print(i + " + ");
	    else
		System.out.print(i + "\n");
    	}
    }
    public static void allWSign(){
    	int i = 1;
    	while(i < 21){
    	    if (i < 20)
    		System.out.print(i + " + ");
	    else
		System.out.print(i + "\n");
    	    i = ++i;
    	}
    }
    public static void allFOSum(){
	int x = 0;
    	for(int i = 1; i < 21; i++){
    	    if (i % 2 == 1){
		x += i;
    		System.out.println(x);
	    }
    	}
    }
    public static void allWOSum(){
    	int i = 1;
	int x = 0;
    	while(i < 21){
    	    if (i % 2 == 1){
		x += i;
    		System.out.println(x);
	    }
    	    i = ++i;
    	}
    }
    public static void allFSer(){
	double x = 1.0;
	for(int i = 0; i < 21; i++){
	    x = x * (1.0/3.0);
	    System.out.println(x);
	}
    }
    public static void allWSer(){
	double i = 1;
	double x = 1.0/3.0;
	while(i < 21){
	    x = x * (1.0/3.0);
	    System.out.println(x);
	    i = ++i;
	}
    }
    // public static void allFE(){
    // 	for(int i = 1; i < 21; i++){
    // 	    if (i % 2 == 0)
    // 		System.out.println(i);
    // 	}
    // }
    // public static void allWE(){
    // 	int i = 1;
    // 	while(i < 21){
    // 	    if (i % 2 == 0)
    // 		System.out.println(i);
    // 	    i = ++i;
    // 	}
    // }




    public static void main(String[] args){
	// allF();
	// allW();
	// allFE();
	// allWE();
	// allFThree();
	// allWThree();
	// allFOS();
	// allWOS();
	// allFSign();
	// allWSign();
	allFOSum();
	allWOSum();
	allFSer();
	allWSer();
    }

}