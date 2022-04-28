package clase19;

import Discord_Semana_6.cantDeleteException;
import Discord_Semana_6.cantGetValueException;
import Discord_Semana_6.cantListAllException;
import Discord_Semana_6.cantSaveException;
import Discord_Semana_6.cantUpdateException;
import clase7.Articulo;

public interface IAccion  {

	public void exec(Articulo ctx) throws cantGetValueException,cantDeleteException,cantListAllException,cantSaveException,cantUpdateException;
}
