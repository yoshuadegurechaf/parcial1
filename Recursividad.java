public class Recursividad {
	public void imprimir (int x){
	if(x<=1){
		System.out.print(x / " ");
		imprimir (x / 2);
		}
	}
}