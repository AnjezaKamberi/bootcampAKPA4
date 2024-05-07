package bootcampAKPA4.seanca11.abstragimi.nderfaqe.struktura;

public interface NderfaqeA {

	public static final String VARIABEL = "KONSTANTE";

	// public final void metodaPare(); GABUAR
	public void metodaPare();

	public String metodaDyte(String parameter);

	public default void metodaTrete() {
		System.out.println("Metode default e implementuar");
	}
}
