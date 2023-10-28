package br.com.ibm;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "Medico", urlPatterns = { "/info-medico" })
public class Medico extends HttpServlet {
    private String nome;
    private String especialidade;
    private int idade;
    private String crp;

    public String getCrp() {
        return crp;
    }

    public void setCrp(String crp) {
        this.crp = crp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        Medico medico1 = new Medico();
        medico1.setNome("Bezerra de Menezes");
        medico1.setIdade(52);
        medico1.setEspecialidade("Psiquiatria");
        medico1.setCrp("CRP-SP 001/2023");

        request.setAttribute("medicoNome", medico1.getNome());
        request.setAttribute("medicoIdade", medico1.getIdade());
        request.setAttribute("medicoEspecialidade", medico1.getEspecialidade());
        request.setAttribute("medicoCrp", medico1.getCrp());

        RequestDispatcher dispatcher = request.getRequestDispatcher("/info-medico.jsp");
        dispatcher.forward(request, response);
    }

}