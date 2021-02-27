package finalhash;

import java.util.*;

public class Dados {
public Hashtable CadMédico;
public Hashtable CadConsulta;
public Hashtable CadPaciente;

public Dados(){
CadMédico=new Hashtable();
CadConsulta=new Hashtable();
CadPaciente=new Hashtable();
}

public void GravaDados(Médico x){
CadMédico.put(x.CodMédico, x);
}

public void GravaDados(Paciente x){
CadPaciente.put(x.CodPac, x);
}

public void GravaDados(Consulta x){
CadConsulta.put(x.CodConsulta, x);
}

public void ListaConsultas(){
Set<String> SetOfConsultas=CadConsulta.keySet();

for(String ChaveConsulta:SetOfConsultas){
Consulta xCon=(Consulta)CadConsulta.get(ChaveConsulta);
System.out.println("\n==============================");
System.out.printf("CONSULTA: %1$s\n", xCon.CodConsulta);
Médico xMed=(Médico)CadMédico.get(xCon.CodMédico);
System.out.printf("MEDICO: %1$s\n", xMed.NomeMed);
Paciente xPac=(Paciente)CadPaciente.get(xCon.CodPac);
System.out.printf("PACIENTE: %1$s\n",xPac.NomePac);
System.out.printf("ATENDIMENTO: %1$s\n", xMed.Espec);
System.out.printf("DATA: %1$s\n", xCon.DataCunsulta);
System.out.printf("HORA: %1$s\n", xCon.HoraConsulta);
System.out.println("==============================\n");
}

}

}