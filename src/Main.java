
public class Main {
	public static void main(String args[]) {
		Patient p = new Patient();
		PatientView v =new PatientView();
		PatientController obj =new PatientController(p,v);
		obj.setPatientName("ajay");
		obj.setDiseaseName("Fever");
		
		obj.viewDetails();
	}
}
 