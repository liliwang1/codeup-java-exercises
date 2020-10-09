package extrainterfaceexercises;

public class Piano extends MusicalInstrument implements Tuneable, VolumeAdjustable {
    private int numberOfKeys;

    public Piano(String a, int b) {
        super(a);
        this.numberOfKeys = b;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

    public void setNumberOfKeys(int b) {
        this.numberOfKeys = b;
    }

    @Override
    public void startMusic() {
        System.out.println("Piano starts playing...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Piano stops playing");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Tuning piano");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("Detuning piano");
    }

    @Override
    public void volumeUp() {
        System.out.println("Increase piano volume");
    }

    @Override
    public void volumeDown() {
        System.out.println("Decrease piano volume");
    }
}
