class College{
      protected String cname="Abc Engineering"	;
}
class Mca_depart extends College{
	String Dname = "Mca";
}

class Eng_depart extends College{
	String Dname ="Eng";
}
public class Simple_Inheritancde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mca_depart md = new Mca_depart();
		System.out.println(md.cname);
		System.out.println(md.Dname);
		
		Eng_depart ed = new Eng_depart();
		System.out.println(ed.cname);
		System.out.println(ed.Dname);
		
	}

}
