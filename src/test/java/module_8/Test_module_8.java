package module_8;

import org.junit.jupiter.api.Test;

public class Test_module_8 {

    Playable pianino = new Pianino();
    Playable guitar = new Guitar();

    @Test
    public void test_pianino(){
        pianino.modelInstrument(Instrument.ModelInstrument.YAMAHA.model);
        pianino.play(Instrument.PIANINO.stringCount);
    }

    @Test
    public void test_guitar(){
        guitar.modelInstrument(Instrument.ModelInstrument.STRINGED.model);
        guitar.play(Instrument.GUITAR.stringCount);
    }

}
