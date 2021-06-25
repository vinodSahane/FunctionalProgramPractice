package programming;

import java.util.Arrays;
import java.util.List;

class Course{
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudent;
	
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String name, String category, int reviewScore, int noOfStudent) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudent = noOfStudent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	public int getNoOfStudent() {
		return noOfStudent;
	}
	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", category=" + category + ", reviewScore=" + reviewScore + ", noOfStudent="
				+ noOfStudent + "]";
	}
	
	
}

public class FP04CustomClass {

	public static void main(String[] args) {
		List<Course> course = Arrays.asList(
				new Course("spring","framework", 98, 2100),
				new Course("spring boot","framework", 95, 2300),
				new Course("API","microservices", 97, 2500),
				new Course("microservices","microservices", 92, 2300),
				new Course("fullstack","fullstack", 91, 2700),
				new Course("azure","cloud", 96, 2300),
				new Course("AWS","cloud", 99, 2700),
				new Course("Docker","cloud", 93, 2800),
				new Course("kubernate","cloud", 98, 2000)
				
				
				);
		
		

	}

}
