package AbstractFactory;

public class EmberToolkit extends AbstractFactory {
	public CPU createCPU() {
	     return new EmberCPU();
	 }

	 public MMU createMMU() {
	     return new EmberMMU();
	 }
}
