
class PatientController {
	Patient model;
	PatientView view;
	
	PatientController(Patient model, PatientView view)
	{
		this.model = model;
		this.view =  view;
	}
	   public void setPatientName(String name){
	      model.setName(name);		
	   }

	   public String getPatientName(){
	      return model.getName();		
	   }

	   public void setDiseaseName(String disease){
	      model.setDisease(disease);		
	   }

	   public String getDiseaseName(){
	      return model.getDisease();		
	   }
	   
	   public void viewDetails() {
		   view.printDetails(getPatientName(), getDiseaseName());
	   }
	  	

}
