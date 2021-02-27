package finalhash;

import java.util.*;

public class Paciente {
public String CodPac;
public int Codigo;
public String NomePac;

public Paciente(int i){

this.Codigo= i;
this.CodPac= Integer.toString(Codigo);
}

public void LêPaciente(){
Scanner S=new Scanner(System.in);
System.out.print("CÓDIGO DO PACIENTE: "+CodPac+"\n");
System.out.print("NOME DO PACIENTE:");
this.NomePac=S.nextLine();
System.out.print("=======================================\n");
}

}
