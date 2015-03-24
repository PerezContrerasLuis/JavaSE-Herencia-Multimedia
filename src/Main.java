
public class Main {

	public static void main(String[] args) {

      ListaMultimedia lista = new ListaMultimedia(4);
      
      Pelicula peli;
      int posicion;
      
      lista.addMultimedia(new Pelicula("Decifrando Enigma","Alan Turing", Formato.dvd,150,"Actor Xman","Actriz Xwoman"));
      
      System.out.print(lista.toString());
      
      peli = new Pelicula("Decifrando Enigma","Alan Turing", Formato.dvd,150,"Actor Xman","Actriz Xwoman");
      
      posicion=lista.idexOf(peli);
      
      System.out.println("posicion"+posicion+"\n"+lista.getMultimedia(posicion));
		

	}

}
