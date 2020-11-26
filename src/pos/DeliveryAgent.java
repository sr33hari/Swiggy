package pos;
//hash map implementation
public class DeliveryAgent implements Comparable<DeliveryAgent> {
	
	private String name;
	private int flag;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public DeliveryAgent(String name, int flag) {
		super();
		this.name = name;
		this.flag = flag;
	}
	@Override
	public int compareTo(DeliveryAgent o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
