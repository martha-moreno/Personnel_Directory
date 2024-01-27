public class Person {
	public String last;
	public String first;
	public String middle;


	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;

	}


	public void printName(int order)
	{

	   if(order == 0)
	   {
	      System.out.println(first + "  " + middle + "  " + last);

	   }else if(order == 1)
	       {

	       System.out.println(last + " ," + middle + " " + first);

	       }
	       else if(order == 2)
		   	       {

		   	       System.out.println(last + " ," + first + " " + middle);

	       }
	}


}
