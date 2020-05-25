package exemplo;

public class LivroDTO {

        private Cliente cliente;
	private String titulo;
	private String autor;
	private String isbn;
	private String editora;
	private String descricao;
	
	public LivroDTO(){
		
	}

    public LivroDTO(Cliente cliente, String titulo, String autor, String isbn, String editora, String descricao) {
        this.cliente = cliente;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editora = editora;
        this.descricao = descricao;
    }
	
        
//	public LivroDTO(String titulo, String autor, String isbn, String editora, String descricao) {
//		super();
//		this.titulo = titulo;
//		this.autor = autor;
//		this.isbn = isbn;
//		this.editora = editora;
//		this.descricao = descricao;
//	}

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
	
        
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	

}
