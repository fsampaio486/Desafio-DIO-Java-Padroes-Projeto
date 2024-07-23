package DesafioDIOJavaPadroesProjeto;

public class Main {

	public static void main(String[] args) {
		
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
        
        Singleton anotherSingleton = Singleton.getInstance();
        anotherSingleton.showMessage();
        
        System.out.println(singleton == anotherSingleton);

	}

}
