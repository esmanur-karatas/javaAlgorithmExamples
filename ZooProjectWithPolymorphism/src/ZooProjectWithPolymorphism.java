
public class ZooProjectWithPolymorphism {

	public static void main(String[] args) {
		Animals animals = new Animals();
		animals.voice();
		
		Cat cat= new Cat();
		cat.catVoice();

		Dog dog= new Dog();
		dog.dog();
	}

}
