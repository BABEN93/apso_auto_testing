package module_8;

public enum Instrument {

    GUITAR(6),
    PIANINO(0);

    final int stringCount;

    Instrument(int stringCount) {
        this.stringCount = stringCount;
    }


    enum ModelInstrument {

        STRINGED("СТРУННАЯ"),
        YAMAHA("YAMAHA");

        final String model;

        ModelInstrument(String model) {
            this.model = model;
        }

    }
}
