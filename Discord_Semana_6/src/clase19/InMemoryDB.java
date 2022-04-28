package clase19;

import java.util.HashMap;
import java.util.Map;

import Discord_Semana_6.cantDeleteException;
import Discord_Semana_6.cantGetValueException;
import Discord_Semana_6.cantListAllException;
import Discord_Semana_6.cantSaveException;
import Discord_Semana_6.cantUpdateException;
import clase7.Articulo;

public class InMemoryDB {

	static private Map<Long,Articulo> db = new HashMap<>();
		
	
	public static void save(Long key,Articulo valor) throws cantSaveException {
		InMemoryDB.db.put(key, valor);
	}
	
	public static void update(Long key, Articulo newValue) throws cantUpdateException {
		InMemoryDB.db.replace(key,newValue);
	}
	
	public static void delete(Long key) throws cantDeleteException {
		InMemoryDB.db.remove(key);
	}
	
	public static Articulo getById(Long key) throws cantGetValueException {
		Articulo value = null;
		if(InMemoryDB.db.containsKey(key)) {
			value = InMemoryDB.db.get(key);
		}
		return value;
	}

	public static void listAll() throws cantListAllException {
		System.out.println(InMemoryDB.db.values());		
	}
}
