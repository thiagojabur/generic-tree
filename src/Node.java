import java.util.List;
import java.util.ArrayList;

public class Node {
	private int valor;
    Node noPai;
	ArrayList<Node> children = new ArrayList<>();
	
	public Node(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Node getNoPai() {
		return noPai;
	}
	public void setNoPai(Node noPai) {
		this.noPai = noPai;
	}	
	public void addFilho(Node noFilho) {
		children.add(noFilho);
		noFilho.setNoPai(this); 
	}
	
	public ArrayList getFilhos() {
		return children;
	}
	
	public int grau() {
		return children.size();
	}
	public String toString() {
		return valor + "";
	}
	
}

