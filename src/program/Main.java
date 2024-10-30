package program;

import entities.Agenda;
import entities.Contato;

public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato();
        contato1.setNome("Maria");
        contato1.setEmail("maria@gmail.com");
        contato1.setTelefone("555-5555");

        Contato contato2 = new Contato();
        contato2.setNome("Joao");
        contato2.setEmail("joao@gmail.com");
        contato2.setTelefone("777-777");

        Agenda agenda =new Agenda();
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);

        agenda.listarContatos();

        System.out.println("---------");
        agenda.buscarContato("Maria");

       agenda.editarContato("Maria", new Contato("Mariana", "666-666", "Mariana@mail.com"));

        System.out.println("---------");
        agenda.buscarContato("Mariana");

        System.out.println("--------");
        agenda.removerContato(contato1);
        agenda.listarContatos();
    }
}
