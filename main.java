package electronics;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		System.out.println("electronic products we offer are :->" + "\n" +"1:tv's" +"\n" +
				"2:fridges"+ "\n"+ "3:microwaves"+ "\n"+ "4:computers"+ "\n"+ "5:mobils"+ "\n"+ "6:air conditionors");
				System.out.println("enter the values ");
				Scanner sc =new Scanner(System.in);
				int n =sc.nextInt();
				
				if(n==1)
				{
				tv t = new tv();
				System.out.println("**********************************************************");
				t.setBrandname("BRAND NAME :- samsung");
				t.setRemoteaccess("ITS A BASIC TV . You have the Remote Access for 100 Meters");
				t.setVoltage("the voltage of tv is : 220");
				t.setWarrenty("tv has two years");
				t.setPrice("price is $500");
		System.out.println(t.getBrandname() +"\n"+ t.getRemoteaccess()+ "\n"+ t.getVoltage()+ 
				"\n" + t.getWarrenty()+ "\n"+ t.getPrice());
				
		System.out.println("*****************************************************************************");
				plasmatv p = new plasmatv();
				p.setBrandname("Here you have a plasma samsung tv ");
				p.setRemoteaccess("ITS A TOPEND PLASMA TV, YOU HAVE THE REMOTE ACCESS FOR 300 METERS");
				p.setDisplayquality(1080);
				p.setConnectivity("YOU CAN USE USB AND WIFI ");
				p.setVoltage("THE VOLTAGE OF PLASMA TV IS : 225");
				p.setWarrenty("one year");
				p.setPrice("price is $1500");
			
				System.out.println(p.getBrandname()+ "\n" + p.getRemoteaccess()+ "\n"+ p.getDisplayquality()+
						"\n" + p.getConnectivity()+ "/n"+ p.getVoltage()+ "\n"+ p.getWarrenty()+ "\n"+ p.getPrice());
				}
				else 
				{
					System.out.println("  ");
				}
	{
		
		{
		}
	
		if(n==2)
		{
			System.out.println("***********************************************************************************");
				fridge fd = new fridge();
				fd.setVoltage("THE VOLTAGE OF BASIC FRIDGE IS 550");
				fd.setBasic("HOW HAVE THE BASIC FRIDGE WITH ONE DEFROZER");
				fd.setWarrenty("one year");
				fd.setPrice("price is $333");
			
			System.out.println(fd.getBasic()+"\n"+ fd.getVoltage()+"\n"+ fd.getWarrenty()+"\n"+fd.getPrice());		
		
		System.out.println("*************************************************************************************************");
			 frenchdoor frd= new frenchdoor();
			 frd.setBasic("TOPEND FRIDGE WITH ,MULTI FROZEN COMPARTMENTS");
			 frd.setFrozencompartment(3);
			 frd.setUnfrozencompartment(1);
			 frd.setWarrenty("two years");
			 frd.setPrice("price is $750");
			 
			 System.out.println(frd.getBasic()+"  IT HAS FROZEN COMPARTMENTS "+ "\n"+ frd.getFrozencompartment()+ "unfrozen compartments "+ frd.getUnfrozencompartment()
			 + frd.getVoltage()+"\n"+ frd.getPrice());
			 
}
	

         else
{
	System.out.println("  ");
}

if(n==3)
{
	System.out.println("******************************************************************************************************************************");
	microwave mv =new microwave();
			 mv.setVoltage("THE VOLTAGE OF MICROWAVE IS 230");
			 mv.setHeat(200);
			 mv.setTime(5);
			 mv.setWarrenty("one year");
			 mv.setPrice("price is $200");

			 System.out.println(mv.getVoltage()+ "\nheat of microwave is "+mv.getHeat()+"\ntime to heat to cook food "+mv.getTime()+"\nwarrenty is"+mv.getWarrenty()+"\n"+mv.getPrice());
}
			 else
			 {
				 System.out.println("   ");
			 }
			 
			 
			 if(n==4)
{
	System.out.println("*********************************************************************************************************************************************");
			 computer cp= new computer();
			 cp.setCpu("computer with configuration 4 standard");
			 cp.setHarddisk(500);
			 cp.setVoltage("THE VOLTAGE OF COMPUTER IS 350");
			 cp.setWarrenty("one year");
			 cp.setPrice("price is $300");
			 System.out.println(cp.getCpu()+"\nhard disk capacity is "+cp.getHarddisk()+"\n"+cp.getVoltage()+"\nwarrenty is "+cp.getWarrenty()+"\n"+cp.getPrice());
	System.out.println("*******************************************************************************************************************");
			 laptop lp = new laptop();
			 lp.setBatterylife(4);
			 lp.setConvertable(360);
			 lp.setHarddisk(500);
			 lp.setWarrenty("one year warrenty");
			 lp.setPrice("price is $700");
			 
			 System.out.println("laptop with battery life is hours -"+lp.getBatterylife()+"\n IT HAS DEGREES"+lp.getConvertable()+"\nhard disk capability"+lp.getHarddisk()+"\n"+lp.getWarrenty()+"\n"+lp.getPrice());

	}
			 else
			 {
				 System.out.println("");
				 }
			 if(n==5)
			 {
			 mobiles mb= new mobiles();
		System.out.println("**********************************************************************************");	 
		 mb.setBstandby(8);
		 mb.setConnectivity("YOU CAN ONLY USE USB CONNECTION");
		 mb.setWarrenty("YOU HAVE one year WARRENTY ");
		 mb.setPrice("THE PRIZE OF THE MOBILE IS $100");
		 System.out.println("mobile battery stand by is "+mb.getBstandby()+"\n"+mb.getConnectivity()+"\n"+mb.getWarrenty()+
				 mb.getPrice());
		 System.out.println("**************************************************************************************");
	
		smartmobile sm= new smartmobile();
		sm.setBstandby(9);
		sm.setConnectivity("here you can have usb and wifi accesible");
		sm.setScreentype("touch screen");
		sm.setPrice("THE PRIZE OF THE SMART MOBILE IS $800");
		System.out.println("smart mobile battery stand by is"+sm.getBstandby()+"\n"+sm.getConnectivity()+"\n"+sm.getScreentype()+"\n"+
		sm.getPrice());
		System.out.println("************************************************************************************************");
			 }
			 else 
			 {
				 System.out.println("");
			 }
		
		if(n==6)
		{
			System.out.println("*********************************************************************************");	
		 airconditionor  ac =new  airconditionor();
		 ac.setTemperature(18);
		 ac.setVoltage("THE VOLTAGE OF THE AC IS 550");
		 ac.setWarrenty("one year warrenty");
		 ac.setPrice("THE PRICE IS $800");
		 System.out.println("NORMAL AC TEMPERATURE IS"+ac.getTemperature()+"\n"+ac.getVoltage()+"\n+"+
				 ac.getWarrenty()+"\n"+ac.getPrice());
		 
	System.out.println("*****************************************************************************************");
			 splitac sp= new splitac();
			 sp.setAutosence("SPLIT AC HAS THE AUTO SENCE");
			 sp.setSwing("IT HAS THE SWING OPTION");
			 sp.setTemperature(2);
			 sp.setVoltage("IT HAS THE VOLTAGE OF 500");
			 sp.setPrice("THE PRICE OF THE SPLIT AC IS $1500");
			 System.out.println(sp.getAutosence()+"\n"+sp.getSwing()+"\n"+sp.getTemperature()
			 +"\n"+sp.getVoltage()+"\n"+sp.getPrice());
			 System.out.println("*********************************************************************");
	}
	else 
	{
		System.out.println("");
	}
			 System.out.println("enter the prize of the product to display the full prize including tax " );
			 Scanner ss =new Scanner(System.in);
				float z=ss.nextInt();
				
				double f= z+(z*0.115);
				System.out.println("the total prize of the product is "+ f);
	}
	



}}


