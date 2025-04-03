package module_8;


public class Guitar implements Playable{

    String guitar = "ГИТАРА";

    @Override
    public void play(int stringCount) {
        System.out.println("Гитара играет с " + stringCount + " струнами.");
    }

    @Override
    public void modelInstrument(String model) {
        System.out.println(guitar);
        System.out.println("Модель: " + model);
    }


}
