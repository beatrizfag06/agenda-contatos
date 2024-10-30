package entities;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> contatos = new ArrayList<>();

    public Agenda() {
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public boolean removerContato(Contato contato) {
        return contatos.remove(contato);
    }

    public void buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                System.out.println(contato);
            }
        }
    }
    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
    public boolean editarContato(String nome, Contato novoContato) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contato.setNome(novoContato.getNome());
                contato.setEmail(novoContato.getEmail());
                contato.setTelefone(novoContato.getTelefone());
            }
        }
        return true;
    }
}
