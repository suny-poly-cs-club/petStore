/*
 	Solution in Java
 */



package petStore;

public class PetStore {

	public static void main(String[] args) {
		Pet[][] petsToBuy = new Pet[5][5];
		Customer[] customers = new Customer[10];
		String names[] = {"Bob", "Jack","EpicMan","Quan","Random Man Who Keeps Knocking At My Door"};
		String[] animalNames = {"Dog","Cat","Fish","Bird", "Fox", "Skunk", "Lizard"};
	    String[] colors  = {"Red","White","Blue","Green","Black","Pink","Orange"};
	    String[] genders = {"Male","Female"};
	    
	    for(int i = 0; i < petsToBuy.length; i++)
	    {
	    	for(int j = 0; j < petsToBuy[i].length; j++)
	    	{
	    		petsToBuy[i][j] = new Pet(animalNames[(int)(Math.random()*7)],(int)(Math.random()*11),colors[(int)(Math.random()*7)],genders[(int)(Math.random()*2)]);
	    	}
	    }
	    
	    for(int i = 0; i < customers.length; i++)
	    {
	    	customers[i] = new Customer(names[(int)(Math.random()*5)],(int)(Math.random()*22),animalNames[(int)(Math.random()*7)],colors[(int)(Math.random()*7)],genders[(int)(Math.random()*2)]);
	    	PetStore.buyPet(customers[i], petsToBuy);
	    }
				
	}
	
	public static void buyPet(Customer person, Pet[][] pets)
	{
		boolean hasFound = false;
		Pet chosenPet = null;
		int tries = 0;
		
		for(int i = 0; i < pets.length; i++)
		{
			for(int j = 0; j<pets[i].length; j++)
			{
				if(hasFound==false && pets[i][j]!=null && ((pets[i][j].getAnimalName().equals(person.getFavAnimal())) && (pets[i][j].getColor().equals(person.getFavColor())) && (pets[i][j].getGender().equals(person.getFavGender()))))
				{
					chosenPet = pets[i][j];
					pets[i][j] = null;
					hasFound = true;
				}
			}
		}
		
		if(hasFound==false)
		{
			tries++;
			for(int i = 0; i < pets.length; i++)
			{
				for(int j = 0; j<pets[i].length; j++)
				{
					if(hasFound==false && pets[i][j]!=null && ((pets[i][j].getAnimalName().equals(person.getFavAnimal())) && (pets[i][j].getColor().equals(person.getFavColor()))))
					{
						chosenPet = pets[i][j];
						pets[i][j] = null;
						hasFound = true;
					}
				}
			}
			
			if(hasFound==false)
			{
				tries++;
				for(int i = 0; i < pets.length; i++)
				{
					for(int j = 0; j<pets[i].length; j++)
					{
						if(hasFound==false && pets[i][j]!=null && ((pets[i][j].getAnimalName().equals(person.getFavAnimal()))))
						{
							chosenPet = pets[i][j];
							pets[i][j] = null;
							hasFound = true;
						}
					}
				}
			}
			
			if(hasFound)
			{
				System.out.println(person.getName() + " has bought a "+chosenPet.getGender()+" "+chosenPet.getColor()+" "+chosenPet.getAnimalName()+"!!!");
			}
			
			else
			{
				System.out.println(person.getName()+ " did not buy any pets!!!! :(");
			}
		}
	}

}


