public class HospitalManager {
private Patient patientListStart = null;

	public static void main(String[] args) {
		HospitalManager hm = new HospitalManager();
		hm.launch();
	}
	
	private void launch(){
		patientListStart= new Patient("John", 33, "Tuberculosis");
		Patient patient1= new Patient("Ali", 25, "Cold");
		Patient patient2= new Patient("Tom",24, "Shakes");
		Patient patient3= new Patient("Robert",35, "Broken Arm");
		Patient patient4= new Patient("Alex",35, "Broken Leg");
		Patient patient5= new Patient("Amanda",35, "Ebola");
		Patient patient6= new Patient("Leyla",21, "Acne");
		Patient patient7= new Patient("Zara",65, "Diabetes");
		Patient patient8= new Patient("Rob",78, "Dementia");
		patientListStart.addPatient(patient1);
		patientListStart.addPatient(patient2);
		patientListStart.addPatient(patient3);
		patientListStart.addPatient(patient4);
		patientListStart.addPatient(patient5);
		patientListStart.addPatient(patient6);
		patientListStart.addPatient(patient7);
		patientListStart.addPatient(patient8);
		
		patientListStart=patient1;
		patientListStart.deletePatient(patient2);
		patientListStart.print();
	}

	
}