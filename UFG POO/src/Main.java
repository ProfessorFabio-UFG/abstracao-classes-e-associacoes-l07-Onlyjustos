import Alunos.Cursos;
import Alunos.Students;
import Clientes.Adress;
import Clientes.Clients;
import Empresas.Employee;
import Empresas.EnderecoFirma;
import Musicas.Compositores;
import Musicas.Musics;
import Empresas.Firm;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Musics[] music = new Musics[10];
        Compositores[] compositores = new Compositores[10];

        Cursos[] c = new Cursos[10];
        Students[] aluno = new Students[10];

        Clients[] cl = new Clients[10];
        Adress[] enderecos = new Adress[10];

        Firm[] firms = new Firm[10];
        Employee[] emp = new Employee[10];
        EnderecoFirma[] enderecosEmpregados = new EnderecoFirma[10];


        compositores[0] = new Compositores("nome","brasil");
        music[0] = new Musics("m", 1999, "b", compositores);
        System.out.println(music[0]);


        c[0] = new Cursos("Computação", "CC", "Institudo de Informatica", "INF");
        aluno[0] = new Students(c, 2000, 2025213);
        System.out.println(aluno[0]);


        enderecos[0] = new Adress("jorge",72304,737287,"itabuna","sla","bahia");
        cl[0] = new Clients(enderecos[0],"a",80083280);
        System.out.println(cl[0]);

        enderecosEmpregados[0] = new EnderecoFirma("a",13123,"c","d","e","f");
        emp[0] = new Employee(enderecosEmpregados[0],"joao",1230023);
        firms[0] = new Firm("238210","juridico",emp,enderecosEmpregados[0]);
        System.out.println(firms[0]);

    }


}