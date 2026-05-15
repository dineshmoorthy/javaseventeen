package javaeight;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Emp implements Comparable< Emp >{

    int empid;
    String name;

    Emp(int empid,String name){
         this.empid = empid;  
         this.name = name;

    }


    @Override
    public String toString(){
        return empid+" "+name;
    }

    @Override
    public int compareTo(Emp o) {

     if(this.empid==o.empid){
       return 0; 
     } 
     else if(this.empid < o.empid){
     return -1;
     }
     else{
       return 1;
     }
    }
}

public class ComaprableExampleOld {


	public static void main(String[] args) {

		ArrayList<Emp> a = new ArrayList<Emp>();

		a.add(new Emp(50, "Ashish"));
		a.add(new Emp(10, "Mahadev"));
		a.add(new Emp(40, "Amit"));
		Collections.sort(a);
		for (Emp id : a) {
			System.out.println(id);
		}
		
		System.out.println(a);
		
	}

}