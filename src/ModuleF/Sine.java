package ModuleF;

public class Sine extends WaveForm {
    public Sine(double frequency, String volume) {
        super(frequency, volume);
    }

    @Override
    public double getAmplitude(double phase) {
        return Math.sin(phase);
    }
}
