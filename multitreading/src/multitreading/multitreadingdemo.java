package multitreading;


	class MultithreadingDemo extends Thread{  
		  public void run(){  
		    System.out.println("I Love My Self.");  
		  }   
		  public static void main(String args[]){  
		     MultithreadingDemo obj=new MultithreadingDemo();   
		     obj.start();  
		  }  
		}

