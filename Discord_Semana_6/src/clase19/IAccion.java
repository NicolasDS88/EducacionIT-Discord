package clase19;

import clase7.Articulo;
import packException.cantDeleteException;
import packException.cantGetValueException;
import packException.cantListAllException;
import packException.cantSaveException;
import packException.cantUpdateException;

public interface IAccion  {

	public void exec(Articulo ctx) throws cantGetValueException,cantDeleteException,cantListAllException,cantSaveException,cantUpdateException;
}
