//parameterized constructor
class EMP{
	int rollno;
	String name;

	EMP(int i,String n)
	{
	rollno=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class ParamConstr {
public static void main(String[] args) {

	Std std1=new Std(2,"Alex");
	Std std2=new Std(10,"Annie");
	std1.display();
	std2.display();
		}
}

