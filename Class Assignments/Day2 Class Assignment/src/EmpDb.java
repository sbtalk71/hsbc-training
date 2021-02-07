
public class EmpDb {

	//according to sir, you can declare the array of EMPLOYEES here, then we dont have to pass the whole array to the other member functions.
	public void listAllEmps(Emp e[])
	{
		for(int i=0;i<e.length;i++)
			if(e[i]!=null)
			e[i].display();
	}
	public void add(Emp e[], Emp ob)
	{
		for(int i=0;i<e.length;i++)
		{
			if(e[i]==null)
			{
				e[i]=ob;
				break;
			}
			else
				i++;
			if(i>=e.length)
			{
				System.out.println("DB full");
				return;
			}
		}
	}
	public void find(Emp e[],int id)
	{
		for(int i=0;i<e.length;i++)
		{
			if(e[i]!=null)
			{
			if(e[i].getEmpId()==id)
				e[i].display();
			}
		}
			
	}
	public static void main(String[] args)
	{
		Emp e[]=new Emp[20];
		e[0]= new Emp(1,"Muskan");
		e[1]= new Emp(2,"Joy");
		
		//System.out.println(e.length);
		//ob.display(e);
		//ob.search(e, 1);
		//Emp ob1=new Emp(3,"Chandler");
		//ob.add(e,ob1);
		//ob.display(e);
		
		EmpDb ed=new EmpDb();
		ed.listAllEmps(e);
		System.out.println();
		Emp ob=new Emp(3,"hii");
		ed.add(e, ob);
		Emp ob1=new Emp(4,"nice");
		ed.add(e, ob1);
		ed.listAllEmps(e);
		System.out.println();
		ed.find(e,3);
		
	}

}