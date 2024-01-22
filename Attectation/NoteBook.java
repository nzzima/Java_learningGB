package Attectation;

public class NoteBook {
    private String manufacturer;
    private int model;
    private int serial_number;
    private String RAM;
    private String HD_space;
    private String OS;

    public NoteBook(String manufacturer, int model, int serial_number,
                    String RAM, String HD_space, String OS) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.serial_number = serial_number;
        this.RAM = RAM;
        this.HD_space = HD_space;
        this.OS = OS;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getModel() {
        return model;
    }

    public int getSerial() {
        return serial_number;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHdSpace() {
        return HD_space;
    }

    public String getOS() {
        return OS;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setSerial(int serial_number) {
        this.serial_number = serial_number;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;;
    }

    public void setHdSpace(String HD_space) {
        this.HD_space = HD_space;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                    "manufacturer='" + manufacturer + '\'' +
                    ", model=" + model +
                    ", serial_number=" + serial_number +
                    ", RAM='" + RAM + '\'' +
                    ", HD_space='" + HD_space + '\'' +
                    ", OS='" + OS + '\'' +
        '}';
    }
}
