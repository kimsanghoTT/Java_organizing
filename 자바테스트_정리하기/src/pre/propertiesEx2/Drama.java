package pre.propertiesEx2;

public class Drama implements Comparable<Drama>{

	private String name;
	private int 출시년도;
	private int 부작;
	
	public Drama() {
		// TODO Auto-generated constructor stub
	}
	
	public Drama(String name, int 출시년도, int 부작) {
		super();
		this.name = name;
		this.출시년도 = 출시년도;
		this.부작 = 부작;
	}

	public String getAnme() {
		return name;
	}

	public void setAnme(String anme) {
		this.name = anme;
	}

	public int get출시년도() {
		return 출시년도;
	}

	public void set출시년도(int 출시년도) {
		this.출시년도 = 출시년도;
	}

	public int get부작() {
		return 부작;
	}

	public void set부작(int 부작) {
		this.부작 = 부작;
	}

	@Override
	public String toString() {
		return "Drama [name=" + name + ", 출시년도=" + 출시년도 + ", " + 부작 + "부작]";
	}
	
	@Override
	public int compareTo(Drama o) {
		return this.name.compareTo(o.name);
		//setProperties로 들어온 수많은 이름들 중의
		//임의의 어떠한 name과 o.name(다른 name들)과 비교해서 알아서 순서를 정렬
	}
}
