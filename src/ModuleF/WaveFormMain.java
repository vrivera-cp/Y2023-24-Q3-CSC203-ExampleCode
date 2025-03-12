package ModuleF;

import java.util.*;

public class WaveFormMain {
    public static final int WAVEFORM_COUNT = 10;
    public static void main(String[] args) {
        WaveForm x = new Sine(440.0, "6dB");
        Sine y = new Sine(880.0, "6dB");

        System.out.println(WaveForm.lastFrequency);

        Random r = new Random();
        List<WaveForm> waveForms = new ArrayList<>();
        for (int i = 0; i < WAVEFORM_COUNT; i++) {
            waveForms.add(new Sine(r.nextDouble() * 440.0, "6dB"));
        }
        Collections.sort(waveForms); // Natural sorting. Only compiles because comparable.

        System.out.println("Original List:");
        for (WaveForm waveForm : waveForms) {
            System.out.println(waveForm);
        }

        List<WaveForm> filtered = waveForms.stream()
                .filter(w -> w.getFrequency() < 220.0)
                .sorted(Comparator.comparingDouble(WaveForm::getFrequency).reversed())
                .toList();

        System.out.println("Filtered List:");
        for (WaveForm waveForm : filtered) {
            System.out.println(waveForm);
        }
    }
}
