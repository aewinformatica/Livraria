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
        String caminhoRelJasper = "Livros.jasper";

        // Lista com beans
        List listaLivros = getLivros();

        // Stream com o .jasper
        InputStream relJasper = this.getClass().getClassLoader().getResourceAsStream("relatorios/" + caminhoRelJasper);

        // O datasource
        JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(
                listaLivros);

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

    public List getLivros() {
        List listaLivros = new ArrayList();

        Cliente cliente = new Cliente();

        cliente.setCli_nome("WAGNER");

        LivroDTO livroDTO = new LivroDTO();

        livroDTO.setCliente(cliente);
        livroDTO.setTitulo("Use a cabeça! Padrões de Projeto - Design Patterns");
        livroDTO.setAutor("Freeman, Eric / Freeman, Elisabeth");
        livroDTO.setIsbn("8576080869");
        livroDTO.setEditora("Alta Books");
        livroDTO
                .setDescricao("Como você sabe que não quer reinventar a roda (ou, "
                        + "pior, um pneu furado), "
                        + "então você busca padrões de projetos");

        listaLivros.add(livroDTO);


        cliente = new Cliente();
        cliente.setCli_nome("ALTIVO");
        
        livroDTO = new LivroDTO();
        livroDTO.setCliente(cliente);
        livroDTO.setTitulo("Entendendo e Dominando o Linux");
        livroDTO.setAutor("Morimoto, Carlos");
        livroDTO.setIsbn("8589535339");
        livroDTO.setEditora("Digerati");
        livroDTO
                .setDescricao("Como o nome diz, este livroDTO é uma obra destinada a "
                        + "todos aqueles que "
                        + "pretendem conhecer na prática e em detalhes os "
                        + "principais recursos oferecidos pelo Linux");
        listaLivros.add(livroDTO);

        cliente = new Cliente();
        cliente.setCli_nome("MARIA");

        livroDTO = new LivroDTO();
        livroDTO.setCliente(cliente);
        livroDTO.setTitulo("Guia de Certificação em Java - Exame CX-310-035");
        livroDTO.setAutor("Pereira, Rafael");
        livroDTO.setIsbn("8573934263");
        livroDTO.setEditora("Ciência Moderna");
        livroDTO.setDescricao("Este Guia de Certificação em Java é um livroDTO "
                + "fundamental para preparar os"
                + " candidatos ao exame de programador Java da Sun, "
                + "a primeira e mais "
                + "requisitada certificação desta tecnologia.");
        listaLivros.add(livroDTO);
        return listaLivros;
    }

    public static void main(String[] args) {
        new Inicio().exibirRelatorio();
    }
}
