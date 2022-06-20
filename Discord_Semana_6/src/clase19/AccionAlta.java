package clase19;

import clase7.Articulo;
import packException.cantSaveException;

public class AccionAlta implements IAccion {

	@Override
	public void exec(Articulo ctx) {

		//usa la base de datos en memoria
		try {
			InMemoryDB.save(ctx.getId(), ctx);
		} catch (cantSaveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
