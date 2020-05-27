package exemplo;

public class OrcamentoDTO {

        private Cliente cliente;
        private Livro livro;
	
	public OrcamentoDTO(){		
	}

    public OrcamentoDTO(Cliente cliente, Livro livro) {
        this.cliente = cliente;
        this.livro = livro;
    }	

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the livro
     */
    public Livro getLivro() {
        return livro;
    }

    /**
     * @param livro the livro to set
     */
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}