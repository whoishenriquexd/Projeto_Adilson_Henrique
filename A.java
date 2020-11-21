/* Nome: Adilson Henrique de Oliveira Lima
Matricula: 201711967
Turma: 10A */

public class A {
    
    private int A1;
    private float A2;
    
    public A(int mA1, float mA2){
        this.A1 = mA1;
        this.A2 = mA2;
    }
    
    public int getA1(){
    	return A1;
    }

	public float getA2(){
    	return A2;
    }
    
    public void setA1(int A1) {
		this.A1 = A1;
	}

	public void setA2(float A2) {
		this.A2 = A2;
    
    public void MA1(){
    	System.out.println("MA1");
  	}
  	
  	public void MA2(){
    	System.out.println("MA2");
  	}
  	
  	public void MA3(){
    	System.out.println("Alteração a classe A partir do clone");
  	}
}

