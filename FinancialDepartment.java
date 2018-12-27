public class FinancialDepartement implements Department{
     private Integer id;
    private String name;
 
    public void printDepartmentNmae(){
        System.out.println(getClass().getSimpleName());
    }
}