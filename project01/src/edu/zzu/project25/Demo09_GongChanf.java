package edu.zzu.project25;

public class Demo09_GongChanf {

	public static void main(String[] args) {
          Dog d = (Dog)new DogFactory().CreatAnimal();
          d.eat();
	}

}

interface Factory {
	public Animal CreatAnimal();

}

class CatFactory implements Factory {

	@Override
	public Animal CreatAnimal() {
		return new Cat();

	}
}
class DogFactory implements Factory{

		@Override
		public Animal CreatAnimal() {
			return new Dog();
			
		}
	
}