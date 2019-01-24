package POne;

public class Inner extends Cone{
	private String Cname;
	public int Id;
	
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		this.Cname = cname;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	 void myTest() {
		Inner e=new Inner();
		NoAcc n=new NoAcc();
	}
	
	
}