package clase19;

import Discord_Semana_6.cantSaveException;
import clase7.Articulo;

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
