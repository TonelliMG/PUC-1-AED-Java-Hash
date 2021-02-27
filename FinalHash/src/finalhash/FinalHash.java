package finalhash;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.util.*;

public class FinalHash {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int i = 1;
        int k = 1;
        int j = 0;

        Dados Cadastro = new Dados();

        Médico MeuMédico;
        Paciente MeuPaciente;
        Consulta MinhaConsulta;

        while (true) {

            System.out.print("|------------------------------------------|\n");
            System.out.print("| Opção 1 - Cadastrar Médico               |\n");
            System.out.print("| Opção 2 - Cadastrar Paciente             |\n");
            System.out.print("| Opção 3 - Adicionar Consulta             |\n");
            System.out.print("| Opção 4 - Listar Consultas               |\n");
            System.out.print("| Opção 5 - Sair                           |\n");
            System.out.print("|------------------------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = S.nextInt();
            ConsoleClear();

            if (opcao == 5) {
                System.out.print("\nEncerrando...");
                S.close();
            }

            switch (opcao) {
                case 1:
                    System.out.print("\n========== CADASTRO MÉDICO ==========\n");

                    MeuMédico = new Médico(j);
                    MeuMédico.LêMédico();
                    Cadastro.GravaDados(MeuMédico);
                    ConsoleClear();
                    break;

                case 2:
                    System.out.print("\n========== CADASTRO PACIENTE ==========\n");

                    MeuPaciente = new Paciente(i);
                    MeuPaciente.LêPaciente();
                    Cadastro.GravaDados(MeuPaciente);
                    i++;
                    ConsoleClear();
                    break;

                case 3:
                    System.out.print("\n========== ADICIONAR CONSULTA ==========\n");

                    MinhaConsulta = new Consulta(k);
                    MinhaConsulta.LêConsulta();
                    Cadastro.GravaDados(MinhaConsulta);
                    k++;
                    ConsoleClear();
                    break;

                case 4:
                    System.out.print("\n========== LISTAR CONSULTAS ==========\n");
                    Cadastro.ListaConsultas();
                    System.out.print("======================================\n");
                    System.out.print("\nPRESSIONE ENTER PARA RETORNAR AO MENU.\n");
                    S.nextLine();
                    S.nextLine();
                    ConsoleClear();
                    break;

                default:
                    System.out.print("\n============================================");
                    System.out.print("\nNAO EXISTE ESSA OPCAO, ENTER PARA RETORNAR");
                    System.out.print("\n============================================\n");
                    S.nextLine();
                    S.nextLine();
                    ConsoleClear();
                    break;
            }

        }

    }

    static void ConsoleClear() {
        try {
            Robot robot = new Robot();

            robot.setAutoDelay(3);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);

        } catch (AWTException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
