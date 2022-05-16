import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Cómo estás?";
    }
    
    public String guestGreeting(String name) {
        // TU CÓDIGO AQUI
	String saludo = String.format("Hola, %s Encantado de verte",name);  
        return saludo;
    }
    
    public String dateAnnouncement() {
        // TU CÓDIGO AQUÍ
        Date date = new Date();
        return "Actualmente es: " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // TU CÓDIGO AQUÍ
	int validacion = conversation.indexOf("Alexis");
	int validacion2 = conversation.indexOf("Alfred");
	String respuesta = "";
	if(validacion>0){
	respuesta = "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso";
	} 
	else if (validacion2>0){
	respuesta = "A su servicio. Como desee, naturalmente";
	} else {
	respuesta = "Bien. Y con eso, me retiraré";
	}

	return respuesta;
    }

    
	// BONUS NINJA
	// Ver las especificaciones para sobrecargar el método guessGreeting
    	// comment from-rainbow 
        // BONUS SENSEI
       // ¡Escribe tu propio método AlfredQuotes usando cualquiera de los métodos String que has aprendido!
}
