package module_4;

public class Car {

    public String model;
    public String year;
    public String colour;

    public Car(String model, String year, String colour) {
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    public Car(String model, String year) {
        this.model = model;
        this.year = year;
    }

    public void getCarModelAndYear() {
        if ("VAZ".equals(model) && "1991".equals(year)) {
            System.out.println("Модель ВАЗ, 1991 год выпуска");
        } else {
            System.out.println("Модель и год выпуска не известно");
        }
    }

    public void getCarModelAndYearAndColour(String modelAuto) {
        if (modelAuto.equals(model) && "2000".equals(year) && "black".equals(colour)) {
            System.out.println("Модель найдена GAZ, 2000 год выпуска, цвет черный");
        } else {
            System.out.println("Модель не найдена");
        }
    }


}
