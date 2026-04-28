package ud7_3;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
public class Main {
public static void main(String[] args) {
		List<Futbolista>jugadores = new ArrayList<>();
		
		jugadores.add(new Futbolista(1, "Casillas", Arrays.asList("Portero"), "Real Madrid"));
		jugadores.add(new Futbolista(15, "Ramos", Arrays.asList("Lateral derecho", "Mediocentro"), "Real Madrid"));
		jugadores.add(new Futbolista(3, "Pique", Arrays.asList("Central"), "FC Barcelona"));
		jugadores.add(new Futbolista(5, "Puyol", Arrays.asList("Central"), "FC Barcelona"));
		jugadores.add(new Futbolista(11, "Capdevila", Arrays.asList("Lateral izquierdo"), "Villareal"));
		jugadores.add(new Futbolista(14, "Xabi Alonso", Arrays.asList("Mediocentro", "Mediocentro defensivo"), "Real Madrid"));
		jugadores.add(new Futbolista(16, "Busquets", Arrays.asList("Mediocentro defensivo"), "FC Barcelona"));
		jugadores.add(new Futbolista(8, "Xavi Hernandez", Arrays.asList("Mediocentro"), "FC Barcelona"));
		jugadores.add(new Futbolista(18, "Pedrito", Arrays.asList("Extremo Izquierdo", "Falso Extremo"), "FC Barcelona"));
		jugadores.add(new Futbolista(6, "Iniesta", Arrays.asList("Extremo derecho", "Mediocentro"), "FC Barcelona"));
		jugadores.add(new Futbolista(7, "Villa", Arrays.asList("Delantero Centro"), "FC Barcelona"));
		
		//Serialización
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String lista = gson.toJson(jugadores);
		
		//Deserialización
		System.out.println("Cadena:");
		System.out.println(lista);
		
		  Type t = new TypeToken<List<Futbolista>>() {}.getType();
		  List<Futbolista> seleccion = gson.fromJson(lista, t);
		  
		  System.out.println("Lista Deserializada:");
		  for(Futbolista f: seleccion) {
			  System.out.println(f);
		  }
		  
		 //Demarcaciones Iniesta
		  
		  List<String>iniesta = new ArrayList<>();
		  
		  for(Futbolista f: seleccion) {
			  if(f.getNombre().equals("Iniesta"))
				  iniesta.addAll(f.getDemarcaciones());
		  }
		  System.out.println("Demarcaciones de Iniesta:");
		  for(String demar: iniesta) {
			  System.out.println(demar);
		  }
	}
}
