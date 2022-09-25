package p1;
public class textclass {
	
	public  static void main(String[] args) {
		
		int monthsalary =25000;
		double hra =0.2;
		double  da= 0.4;
		int ta= 0;
		String incometax="";
		double annualsalary = monthsalary*12+hra+da+ta;
		if(annualsalary<500000)
		{
				incometax="no";
		}
		
		else if(annualsalary>=500000 && annualsalary<=1000000)
		{
			incometax ="0.1";
		}
		else if (annualsalary>=1000000 && annualsalary<=2000000)
		{
			incometax ="0.2";
		}
		else if(annualsalary>2000000)
		{
			incometax ="0.3";
		}System.out.println(" salary "+monthsalary+" tax "+incometax+" incometax");
}
}