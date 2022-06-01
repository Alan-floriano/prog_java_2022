package br.com.senaisp.aula21.classes;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private String documento;
	private List<Produto> listaItens;

	public Pedido(String Documento) throws Exception {
		return;
	}

	public void setDocumento(String documento) throws Exception {
		if (documento.length()<3)
			throw new Exception("Documento deve ter pelo menos 3 caracteres");
		this.documento = documento;
	}

	public void Pedido(String documento) {
		this.documento = documento;
		listaItens = new ArrayList<Produto>();
	}

	public void adicionarProduto(Produto prod) {
		listaItens.add(prod);
	}

	public void removerProduto(int indiceProd) {
		listaItens.remove(indiceProd);
	}

	public double totalPedido() {
		double dblTot = 0;
		for (int intI = 0; intI < listaItens.size(); intI++) {
			dblTot += listaItens.get(intI).precoTotal();
		}
		return dblTot;
	}

	public void listarItens() {
		System.out.println("Listagem de Itens");
		System.out.println("# - Descrição - Qtde - Preço");
		System.out.println("___________________");
		for (int intI=0;intI<listaItens.size();intI++) {
			Produto prod = listaItens.get(intI);
			System.out.println(intI);
			System.out.println(" - " + prod.getNome());
			System.out.println(" - " + prod.getQtde());
			System.out.println(" - " + prod.getPreco());
			System.out.println(" - " + prod.precoTotal());
						
		}
	}
}