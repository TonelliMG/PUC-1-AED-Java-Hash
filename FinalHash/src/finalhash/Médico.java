package finalhash;

import java.util.*;

public class Médico {
public String CodMédico;
public int CRM;
public String NomeMed;
public String Espec;

public Médico(int j){
    Scanner S=new Scanner(System.in);
    System.out.print("CRM DO MEDICO:");
    j=S.nextInt();
    this.CRM= j;
    this.CodMédico= Integer.toString(CRM);
}

public void LêMédico(){
Scanner S=new Scanner(System.in);
System.out.print("NOME DO MEDICO:");
this.NomeMed=S.nextLine();
System.out.print("ESPECIALIDADE DO MÉDICO:");
this.Espec=S.nextLine();
System.out.print("\n=====================================\n");
}
}