class RangeDemo {
	public static void main(String args[]){
	 //byte
	 byte myData = 127;
	 System.out.println(myData); //incompatible type when we assign value greater than 127 coz comiple type checking
	  myData += 1;
	 System.out.println(myData); //works coz wrap up hota;
	  myData += 1;
	 System.out.println(myData);
	 // short
	 short vari = 32767;
	 System.out.println(vari);
	 vari++;
	 System.out.println(vari);
	 //char
	 char s = 55; //ascii value gets assigned
	 System.out.println(s);
	 //float
	 float f= 25.6f; //error java assumes it to be double possible losing  data conversion
	 System.out.println(f);
	 //double
	 double d= 25.6; 
	 System.out.println(d);
	 if(d == f){
	 	System.out.println("same");
	 }
	 else{
	 	System.out.println("different");
	 }
	 //boolean
	 boolean bool = true;
	 System.out.println(bool);
	}
}
