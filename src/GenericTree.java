
public class GenericTree {
	private Node raiz;
	
	public Node root() {
		return raiz;
	}

	public GenericTree(Node raiz) {
		this.raiz = raiz;
	}
	
	public String toString() {
		//tem que arrumar
		
		return raiz.getValor() + "\n" + raiz.getFilhos();
		
	}
	
	
}
