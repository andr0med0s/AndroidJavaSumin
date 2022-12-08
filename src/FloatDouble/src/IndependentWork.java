public class IndependentWork {
    public static void main(String[] args) {
        int time = 15; // тукещее время \ время для проверки \ задается пользователем \ условием
        boolean goodWeather = false; // задается пользователем \ условием
        boolean night = time >= 23 || time <= 5;


        if (night) {
            System.out.println("Спать");
        }
        if(!night && goodWeather) {
            System.out.println("Гулять");
        }
        if(!night && !goodWeather) {
            System.out.println("Читать книгу");
        }


    }
}
