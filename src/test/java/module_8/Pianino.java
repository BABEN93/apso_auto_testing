package module_8;


public class Pianino implements Playable {

    String pianino = "ПИАНИНО";

    @Override
    public void play(int stringCount) {
        System.out.println("Пианино играет, но у него нет струн. (Количество струн: " + stringCount + ")");
    }

    @Override
    public void modelInstrument(String model) {
        System.out.println(pianino);
        System.out.println("Модель: " + model);
    }




}
