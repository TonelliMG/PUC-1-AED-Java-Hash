package finalhash;

import java.util.*;

public class Consulta {
public String CodConsulta;
public int NumConsulta;
public String DataCunsulta;
public String HoraConsulta;
public String CodPac;
public String CodMédico;

public String NomePac;
public String Espec;


public Consulta(int k){

this.NumConsulta= k;
this.CodConsulta= Integer.toString(NumConsulta);
}

public void LêConsulta(){
    
Scanner S=new Scanner(System.in);
System.out.print("NUMERO DA CONSULTA: "+CodConsulta+"\n");
System.out.print("DATA DA CONSULTA:");
this.DataCunsulta=S.nextLine();
System.out.print("HORA DA CONSULTA:");
this.HoraConsulta=S.nextLine();
System.out.print("CODIGO DO PACIENTE:");
this.CodPac=S.nextLine();
System.out.print("CRM DO MEDICO:");
this.CodMédico=S.nextLine();
System.out.print("========================================\n");
}
}