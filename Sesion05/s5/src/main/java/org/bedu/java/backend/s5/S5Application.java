package org.bedu.java.backend.s5;

import org.bedu.java.backend.s5.e1.model.Saludo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S5Application implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(S5Application.class, args);
	}
	// -------------- Ejemplo 1--------------------------

	//Forma 1 ->
	// No se recomienda porque cambia el nivel de acceso de privado a publiuco para asignar la instancia
	// y luego regresa de publico a privado -> hace que se tarde
	/* @Autowired //con esta anotación busca la dependencia y hace la inyección
	private Saludo saludo;*/

	/* Forma 2 */
	//Esta es la manera recomendada ya que no cambia el nivel de acceso y no permite modificar la instancia

	/*private Saludo saludo;

	@Autowired
    public Sesion5Application(Saludo saludo) {
        this.saludo = saludo;
    }

    //public Sesion5Application(@Autowired Saludo saludo) {
      //this.saludo = saludo; }
	}*/

	// Forma 3

	private final Saludo saludo;

	@Autowired
	public S5Application(/*@Autowired*/ Saludo saludo) {
		this.saludo = saludo;
	}



	@Override
	public void run(String... arg) throws Exception {
		System.out.println(saludo.getNombre());
	}

}
