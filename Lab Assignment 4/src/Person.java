public class Person {
	/**
	 * @author aisiri
	 *    name of the account holder
	 */
   private String name;
   /**
	 * @author aisiri
	 *    age of the account holder
	 */
	
   private float age;
   public Person(String name, float age) {
		this.name = name;
		this.age = age;
	}
    public String getName() {
	return name;
    }
   public float getAge() {
	return age;
}
}
