package ModuleF;

public abstract class WaveForm implements Comparable<WaveForm> {
    private double frequency;
    private String volume;
    public static double lastFrequency;

    public WaveForm(double frequency, String volume) {
        this.frequency = frequency;
        this.volume = volume;
        lastFrequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }

    public abstract double getAmplitude(double phase);

    @Override
    public boolean equals(Object object) {
        if (object instanceof WaveForm waveForm) {
            return (volume == null ? waveForm.volume == null : volume.equals(waveForm.volume))
                    && (frequency == waveForm.frequency);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%.2f", frequency);
    }

    @Override
    public int compareTo(WaveForm waveForm) {
        if (frequency < waveForm.frequency) return -1;
        if (frequency > waveForm.frequency) return 1;
        return 0;
    }
}
