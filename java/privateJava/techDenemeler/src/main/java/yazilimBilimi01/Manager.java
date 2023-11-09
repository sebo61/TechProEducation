package yazilimBilimi01;

public class Manager extends Employee{
    private int num_of_employes;


    public Manager(String name, String department, int salary,int num_of_employes)
    {
        super(name,department,salary);
        this.num_of_employes=num_of_employes;
    }
    public void raiseSalary(int amount){
        System.out.println("Çalışanlara "+amount+" tl zam yapıldı");

    }

    @Override
    public void showInfos() {

        super.showInfos();
        System.out.println("Sorumlu olunan personel..:"+this.num_of_employes);
    }
}
