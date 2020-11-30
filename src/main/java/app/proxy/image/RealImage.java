package app.proxy.image;

import java.io.File;

public class RealImage extends File implements IImage {
    private String fileName; 
    private static final long serialVersionUID = 1L;

    public RealImage(String name) {
        super(name);
        this.fileName = name;
        loadFromDisk(name);
    }

    private void loadFromDisk(String name) {
        System.out.println("Loading... " + name);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + this.fileName);
    }

    @Override
    public void showImageProperties() {
        String lenght = String.valueOf(super.length());
        String absolutePath = super.getAbsolutePath();

        System.out.println("O path da imagem " + this.fileName + " e: " + absolutePath + " e o tamanho da imagem é: " + lenght);
    }
    
}