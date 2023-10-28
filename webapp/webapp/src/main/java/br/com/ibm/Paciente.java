package br.com.ibm;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Paciente", urlPatterns = { "/info-paciente" })
public class Paciente extends HttpServlet {

    private String nome;
    private int idade;
    private String cpf;
    private String transtorno;
    private String registro;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTranstorno() {
        return transtorno;
    }

    public void setTranstorno(String transtorno) {
        this.transtorno = transtorno;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        Paciente paciente1 = new Paciente();

        paciente1.setNome("Michael Cruz");
        paciente1.setIdade(31);
        paciente1.setCpf("11122233344");
        paciente1.setRegistro("141165");
        paciente1.setTranstorno("Défict de Atenção / Hiperatividade");

        request.setAttribute("pacienteNome", paciente1.getNome());
        request.setAttribute("pacienteIdade", paciente1.getIdade());
        request.setAttribute("pacienteCpf", paciente1.getCpf());
        request.setAttribute("pacienteRegistro", paciente1.getRegistro());
        request.setAttribute("pacienteTranstorno", paciente1.getTranstorno());

        RequestDispatcher dispatcher = request.getRequestDispatcher("/info-paciente.jsp");
        dispatcher.forward(request, response);
    }

}