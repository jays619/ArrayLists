package pack;
import java.util.ArrayList;


public class Mobile_Tester {

	public static void main(String[] args) {
	
		
		Phone obj2 = new Phone();
		obj2.Pname = "Iphone";
		
		
		Customer obj3 = new Customer();
		obj3.firstName = "Jays";
		obj3.lastName = "Hoffy";
		
		
		MobilePhoneCompany obj = new MobilePhoneCompany();
		obj.companyName = "GooB";
		obj.phones = new ArrayList<>();
		obj.customers = new ArrayList<>();
		
		
		obj.customers.add(obj3);
		
		obj.phones.add(obj2);
		
		Phone obj5 = new Phone();
		obj5.Pname = "Android";
		
		
		Customer obj6 = new Customer();
		obj6.firstName = "John";
		obj6.lastName = "smith";
		
		
		MobilePhoneCompany obj7 = new MobilePhoneCompany();
		obj7.companyName = "BargainDeals";
		obj7.phones = new ArrayList<>();
		obj7.customers = new ArrayList<>();
		
		
		obj7.customers.add(obj6);
		
		obj7.phones.add(obj5);

		Phone obj8 = new Phone();
		obj8.Pname = "Nokia";
		
		
		Customer obj9 = new Customer();
		obj9.firstName = "Seymour";
		obj9.lastName = "Butts";
		
		
		MobilePhoneCompany obj10 = new MobilePhoneCompany();
		obj10.companyName = "Fry's Electronics";
		obj10.phones = new ArrayList<>();
		obj10.customers = new ArrayList<>();
		
		
		obj10.customers.add(obj9);
		
		obj10.phones.add(obj8);

		
		
		ArrayList<MobilePhoneCompany> obj4 = new ArrayList<>();
		obj4.add(obj10);
		obj4.add(obj7);
		obj4.add(obj);
		 
		
		for(MobilePhoneCompany company : obj4)
		{
			System.out.println(company.companyName);
			
			
				for(Customer custs : company.customers)
					System.out.println(custs.firstName + " " + custs.lastName);
				
				
				for(Phone type: company.phones){
					System.out.println(type.Pname);
				
			}
		}
		
		
		
		
		 
		
	}

}
