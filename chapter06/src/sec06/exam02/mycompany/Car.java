package sec06.exam02.mycompany;

import sec06.exam02.hankook.*;//Tire
import sec06.exam02.kumho.*;//BigWidthTire, Tire
import sec06.exam02.hyndai.Engine; // Engine


public class Car {
	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	//Tire tire3 = new Tire();
	
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
}
