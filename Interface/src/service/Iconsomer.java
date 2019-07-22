package service;

public interface Iconsomer {
	
public Boolean manger();
public void boire();

default void macher() {
	System.out.println("Quand je mange je mache avant d'avaler");
}


}
