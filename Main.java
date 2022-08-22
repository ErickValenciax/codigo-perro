	import java.util.Scanner ;
	class Dog{
    
    //Atributos
    String name;
    String breed;
    String color;
    int age;
    
    //Metodos


    //metodo constructor  vacio
    public Dog(){
        
        name = "";       
        breed = "";
        color = "";
        age = 0;
    } 

    //metodo constructor no vacio
    
    	public Dog(String name, String breed, String color, int age){
        
	        this.name = name;    
	        this.breed = breed;
	        this.color = color;
	        this.age = age;
	    } 

	    //Setters

	    public void setName (String nombre){
	    	name=nombre;
	    }
	    
	    public void setBreed (String raza){
	    	breed=raza;
	    }
	    public void setColor(String colorcito){
	    	color=colorcito;
	    }
	    public void setAge (int edad){
	    	age=edad;
	    }

	    //Getters

	    public String getName (){
	    	return (name);
	    }

	    public String getBreed (){
	    	return (breed);
	    }

	    public String getColor (){
	    	return (color);
	    }

	    public int getAge (){
	    	return (age);
	    }

	    public void imprimeObj(){
	        System.out.println("\nEl nombre: " +getName());
	        System.out.println("La raza: " +getBreed());
	        System.out.println("El color: " +getColor());
	        System.out.println("La edad: " +getAge());
	    } 
	        
	    public void ladrar(){
	        System.out.println("guaf, guaf!");
	    }
	    
	    public void comer(){
	        System.out.println("chom, chom!");
	    }
       
    }
class Main { 

    //clase principal

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Edad = 0;
    	System.out.println("Creamos un perro con atributos vacios");
    	Dog perro1= new Dog();
    	perro1.imprimeObj();
    	System.out.println("Ese perro será el de la 1a imagen");
	System.out.println("Establece el nombre del perro");
    	perro1.setName (in.nextLine());
	System.out.println("Establece la raza del perro");
    	perro1.setBreed (in.nextLine());
	System.out.println("Establece el color del perro");
    	perro1.setColor (in.nextLine());
	System.out.println("Establece la edad del perro");
    	perro1.setAge (in.nextInt());
	while(Edad < 1){
		System.out.println("Edad incorrecta, vuelve a intentarlo:");
		Edad = in.nextInt();
	}
    	System.out.println("Veamos...");
    	perro1.imprimeObj();
    	System.out.println("El perro " + perro1.getName() + " realizará acciones");
    	perro1.ladrar();
    	perro1.comer();
	System.out.println("Creamos un perro con atributos de la 2a imagen");
    	Dog perro2= new Dog("Puppy", "Labrador", "Beige", 1);
    	System.out.println("Veamos...");
    	perro2.imprimeObj();
 	 }
}



  
    

    
      
    
    
    