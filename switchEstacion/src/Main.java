public class Main {
    public static void main(String[] args) {
        var estacion = "hola";

        switch (estacion) {

            case "invierno":
                System.out.println("Es invierno!");
                break;
            case "primavera":
                System.out.println("Es Primavera!");
                break;
            case "verano":
                System.out.println("Es verano!");
                break;
            case "otoño":
                System.out.println("Es otoño!");
                break;
            default:
                System.out.println("Debes introducir una estación");

        }
    }
}