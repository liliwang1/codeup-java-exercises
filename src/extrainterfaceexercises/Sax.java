package extrainterfaceexercises;

public class Sax extends MusicalInstrument implements Tuneable, VolumeAdjustable {
    private String saxType;

    public Sax(String a, String b) {
        super(a);
        this.saxType = b;
    }

    public String getSaxType() {
        return this.saxType;
    }

    public void setSaxType(String b) {
        this.saxType = b;
    }

    @Override
    public void startMusic() {
        System.out.println("Saxophone starts playing...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Saxophone stops playing");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Tuning saxophone");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("Detuning saxophone");
    }

    @Override
    public void volumeUp() {
        System.out.println("Increase saxophone volume");
    }

    @Override
    public void volumeDown() {
        System.out.println("Decrease saxophone volume");
    }
}
