 class Employee
{
int id;
String name;
void SetId(int x)
{
id=x;
}
void SetName(String n)
{
name=n;
}
void DisplayDetails()
{
System.out.print("Id is:" +id "Name is:" +name);
}

    public static void main(String[] args) 
    {
Employee emp = new Employee();
emp.SetId(2001);
emp.SetName("ashish");
emp.DisplayDetails();
}
    
    }
