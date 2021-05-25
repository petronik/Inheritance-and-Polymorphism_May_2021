
public class PayrollDriver {
    
    public static void main(String[] args) {
        int count;
        int entry;
        int g = 1; //counter for number of employees
        int k = 0; //counter of accounts[] indexes
        System.out.print("Enter number of employees: ");
        count = Integer.parseInt(Employee2.sn.nextLine());

        Employee2[] accounts = new Employee2[count];
        Hourly h1 = new Hourly();
        Salaried s1 = new Salaried();
        SalariedPlusComition spc1 = new SalariedPlusComition();
        
        while(true) {            
            System.out.printf("PROFILE FOR EMPLOYEE #%d:\n" +
                "type Hourly(1), Salaried(2), Salaried plus Commission(3)\n" +
                "Enter 1, 2, or 3: ", g);
            entry = Integer.parseInt(Employee2.sn.nextLine());
            g++;
            switch(entry){
                case 1 : accounts[k] = h1; h1.load();  break;
                case 2 : s1.load(); accounts[k] = s1; break;
                case 3 : spc1.load(); accounts[k] = spc1; break;
            }
                
            if(g > accounts.length ){
                System.out.println("\n LIST OF EMPLOYEES \n");
                break; 
            }
            k++;  
        }
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].toString());
            
        }
        Employee2.sn.close();
    }
}
