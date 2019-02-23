import java.util.List;

public class GeradorNotaFiscal {

	private EnviadorEmail email;
	private NotaFiscalDAO dao;
	private List<AcaoAposGerarNota> acoes;

	public GeradorNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;
	}

	public EnviadorEmail getEmail() {
		return email;
	}

	public void setEmail(EnviadorEmail email) {
		this.email = email;
	}

	public NotaFiscalDAO getDao() {
		return dao;
	}

	public void setDao(NotaFiscalDAO dao) {
		this.dao = dao;
	}

	public NotaFiscal gera(Fatura fatura) {
		double valor = fatura.getValorMensal();

		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobre0(valor));

		for (AcaoAposGerarNota acao : acoes) {
			acao.executa(nf);
		}

		return nf;

	}

	private double impostoSimplesSobre0(double valor) {
		return valor * 0.06;
	}
}
