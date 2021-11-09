package mx.edu.uacm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Solo las clases son anotadas, interfaces no
@Component
public class Ninja {
	
	@Autowired //inyeccion de dependencias
	@Qualifier("espada")//aquí se hace la diferencia de la arma, ya sea espada o chacos
	private Arma arma;
	
	@Value("pasar nivel")//inyeccion la mision y le pasamos un valor
	private String mision;
	
	
	/**
	 * @return the arma
	 */
	public Arma getArma() {
		return arma;
	}
	/**
	 * @param arma the arma to set
	 */
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	/**
	 * @return the mision
	 */
	public String getMision() {
		return mision;
	}
	/**
	 * @param mision the mision to set
	 */
	public void setMision(String mision) {
		this.mision = mision;
	}
	
	

	
}
