public class Computer {

private int storageSpace;
private String printerModel;

public Computer(int storageSpaceInput, String printerModelInput){
    this.storageSpace = storageSpaceInput;
    this.printerModel = printerModelInput;
}

    public int getStorageSpace() {
        return this.storageSpace;
    }

    public int getMoreStorage(){
        return this.storageSpace + 200;

    }
    public String setUpdatePrinter(){
        return this.printerModel +(" HP printer ");

    }
}
