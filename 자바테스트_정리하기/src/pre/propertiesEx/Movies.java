package pre.propertiesEx;

public class Movies implements Comparable<Movies>{

	private String name;
	private int 평점;
	private int 관람객;
	
	public Movies() {
		// TODO Auto-generated constructor stub
	}

	public Movies(String name, int 평점, int 관람객) {
		super();
		this.name = name;
		this.평점 = 평점;
		this.관람객 = 관람객;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int get평점() {
		return 평점;
	}

	public void set평점(int 평점) {
		this.평점 = 평점;
	}

	public int get관람객() {
		return 관람객;
	}

	public void set관람객(int 관람객) {
		this.관람객 = 관람객;
	}
	
	@Override
	public String toString() {
		return "name=" + name + ", 평점=" + 평점 + ", 관람객=" + 관람객;
	}
	
	public int compareTo(Movies o) {
		//비교는 스스로 만들어 기준을 정하기 위해 처음값이 0
		return this.name.compareTo(o.name);
	}
}
