package exemplo;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Inicio {

    public void exibirRelatorio() {
        // Caminho do .jasper
        String caminhoRelJasper = "Orcamentos.jasper";

        // Lista com beans
        List listaOrcamentos = getOrcamentos();

        // Stream com o .jasper
        InputStream relJasper = this.getClass().getClassLoader().getResourceAsStream("relatorios/" + caminhoRelJasper);

        // O datasource
        JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(
                listaOrcamentos);

        // Parametros do relatorios
        Map parametros = new HashMap();

        JasperPrint impressao = null;
        try {

            impressao = JasperFillManager.fillReport(relJasper, parametros, ds);
            JasperViewer viewer = new JasperViewer(impressao, true);
            viewer.setVisible(true);

        } catch (JRException e) {
            System.out.println(e.getMessage());
        }

    }

    public List getOrcamentos() {
        List listaOrcamentos = new ArrayList();

        Cliente cliente = new Cliente();

        cliente.setCli_nome("WAGNER");

        Livro livro = new Livro();

        livro.setTitulo("Use a cabeça! Padrões de Projeto - Design Patterns");
        livro.setAutor("Freeman, Eric / Freeman, Elisabeth");
        livro.setIsbn("8576080869");
        livro.setEditora("Alta Books");
        livro
                .setDescricao("Como você sabe que não quer reinventar a roda (ou, "
                        + "pior, um pneu furado), "
                        + "então você busca padrões de projetos");

        OrcamentoDTO orcamentoDTO = new OrcamentoDTO();
        orcamentoDTO.setCliente(cliente);
        orcamentoDTO.setLivro(livro);
        listaOrcamentos.add(orcamentoDTO);

        cliente = new Cliente();
        cliente.setCli_nome("ALTIVO");

        livro = new Livro();
        livro.setTitulo("Entendendo e Dominando o Linux");
        livro.setAutor("Morimoto, Carlos");
        livro.setIsbn("8589535339");
        livro.setEditora("Digerati");
        livro
                .setDescricao("Como o nome diz, este livro é uma obra destinada a "
                        + "todos aqueles que "
                        + "pretendem conhecer na prática e em detalhes os "
                        + "principais recursos oferecidos pelo Linux");
        
        orcamentoDTO = new OrcamentoDTO();
        orcamentoDTO.setCliente(cliente);
        orcamentoDTO.setLivro(livro);
        listaOrcamentos.add(orcamentoDTO);

        cliente = new Cliente();
        cliente.setCli_nome("MARIA");

        livro = new Livro();
        livro.setTitulo("Guia de Certificação em Java - Exame CX-310-035");
        livro.setAutor("Pereira, Rafael");
        livro.setIsbn("8573934263");
        livro.setEditora("Ciência Moderna");
        livro.setDescricao("Este Guia de Certificação em Java é um livro "
                + "fundamental para preparar os"
                + " candidatos ao exame de programador Java da Sun, "
                + "a primeira e mais "
                + "requisitada certificação desta tecnologia.");
        
        orcamentoDTO = new OrcamentoDTO();
        orcamentoDTO.setCliente(cliente);
        orcamentoDTO.setLivro(livro);
        listaOrcamentos.add(orcamentoDTO);
        return listaOrcamentos;
    }

    public static void main(String[] args) {
        new Inicio().exibirRelatorio();
    }
}
