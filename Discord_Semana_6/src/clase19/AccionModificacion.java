package clase19;

import clase7.Articulo;
import packException.cantGetValueException;
import packException.cantUpdateException;

public class AccionModificacion implements IAccion {

	@Override
	public void exec(Articulo ctx) {

		Articulo art;
		try {
			art = InMemoryDB.getById(ctx.getId());

			// System.out.println("Ingrese titulo nuevo");

			if (art != null) {
				try {
					InMemoryDB.update(ctx.getId(), ctx);
				} catch (cantUpdateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (cantGetValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
