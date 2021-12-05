class Vehicle {
	void run (){
		System.out.println("vehicle is running");
	}
}
class Bike extends Vehicle{
	void run(){
	System.out.println("Please ride bike slow");
	}
		public static void main(String args[]){
		Bike b= new Bike();
		b.run();
	}
}
