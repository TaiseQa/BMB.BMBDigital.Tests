package inmetrics.automacao.evidencia.pdf.entidades;

public class Evidencia {
	public String DescricaoPasso = "";
	public String DescricaoFalha = "";
	public String CaminhoEvidencia = "";

	public Evidencia() { }
	
	public Evidencia(String caminhoEvidencia, String descricaoPasso, String descricaoFalha) {
		this.DescricaoPasso = descricaoPasso;
		this.DescricaoFalha = descricaoFalha;
		this.CaminhoEvidencia = caminhoEvidencia;
	}
}
