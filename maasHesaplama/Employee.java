package maasHesaplama;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	Employee(String name,double salary,int workHours,int hireYear){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	double tax() {
		if(salary>1000) {
			return salary*0.03;
		}
		else {
			return 0;
		}
			
	}
	double bonus() {
		
		if(workHours>40) {
			return (workHours-40)*30;
			 
		}
		else {
			return 0;
		}
	}
	double raiseSalary()
	{
		
		hireYear=2021-hireYear;
		if(hireYear<10) {
			return salary*0.05;
		}
		else if(hireYear>9 && hireYear<20) {
			return salary*0.10;
		}
		else if(hireYear>19){
			return salary*0.15;
		}
		return 0.0;
	}

    public String toString() {

        System.out.println("---------------------");
        return "Name: " + this.name + "\nSalary: " + this.salary + "\nWork Hours: " + workHours + "\nHire Year: "
                + hireYear +
                "\nVergi ve Bonuslar ile birlikte maaş: " + (this.salary + bonus() - tax()) + "\nToplam Maas: "
                + (this.salary + bonus() - tax() + raiseSalary());
    }
	
}
