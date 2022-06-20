package clase19;

import clase7.Articulo;
import packException.cantDeleteException;

public class AccionBaja implements IAccion {
	
	@Override
	public void exec(Articulo ctx) {
		
		//dar de baja por id
		try {
			InMemoryDB.delete(ctx.getId());
		} catch (cantDeleteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Se ha elminado el articulo de id:" + ctx.getId());
	}

}
