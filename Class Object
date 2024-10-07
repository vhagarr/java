class manager{
     float Salary_Cal(float salary){
        float temp;
        temp=(salary*10)/100;
        return salary -temp;
    }
}
class employee extends manager{
    private String name;
    private float salary;
    public void set_datails(String name,float salary){
        this.name=name;
        this.salary=salary;
    }
    public void ge_tDetails(){
        System.out.println("Name:-"+name);
        System.out.println("Salary:-"+salary);
        System.out.println("EMI Salary:-"+Salary_Cal(salary));
    }
}
class Class{
    public static void main(String[] args) {
        employee emp=new employee();
        emp.set_datails("Ranjti", 15000);
        emp.ge_tDetails();
    }
}
