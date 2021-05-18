package shahn;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import shahn.Patient;

public class decision {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		int bcount=0,ocount=0;
		String sDate1="13/06/2021";  
		String sDate2="16/06/2021";  

	    Date from=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	    Date to=new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);  
	    
		List<Patient> allPatient = new ArrayList<shahn.Patient>();

	    Patient p=new Patient();
	    p.setName("shahnawaz");
	    p.setlocation("jharkhand");
	    p.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("12/5/2021"));
	    allPatient.add(p);
	    Patient p2=new Patient();
	    p2.setName("kame");
	    p2.setlocation("asam");
	    p2.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("13/05/2021"));
	    allPatient.add(p2);
	    Patient p3=new Patient();
	    p3.setName("sayeedur");
	    p3.setlocation("mangalore");
	    p3.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("14/05/2021"));
	    allPatient.add(p3);
	    Patient p4=new Patient();
	    p4.setName("abhishekh");
	    p4.setlocation("Bangalore");
	    p4.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("16/05/2021"));
	    allPatient.add(p4);
	    Patient p5=new Patient();
	    p5.setName("naresh");
	    p5.setlocation("Bangalore");
	    p5.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("17/05/2021"));
	    allPatient.add(p5);
	    
	    int sizeAll=allPatient.size();
	    for(int i=0;i<allPatient.size();i++){
	    	if(allPatient.get(i).getlocation()=="Bangalore"){
	    		if(allPatient.get(i).getdate1().compareTo(from)>0 && allPatient.get(i).getdate1().compareTo(to)<0){
	    			bcount++;
	    		}
	    		else{
	    		sizeAll--;
	    		}
	    	}else{
		    	ocount++;
	    	}
	    }
	    
	    System.out.println(" Patient From Bangalore are  "+bcount);
	    System.out.println(" Patient From outside of Bangalore are  "+ocount);
	    
	    
	    Double inPatientPercentage = Double.valueOf(bcount * 100 / sizeAll);
       	    Double outPatientPercentage = Double.valueOf(ocount * 100 / sizeAll);
	    System.out.println("Percentage of total patient  from bangalore  "+inPatientPercentage);
	    System.out.println("Percentage of total patient  from outside of bangalore  "+outPatientPercentage);

	}

}

