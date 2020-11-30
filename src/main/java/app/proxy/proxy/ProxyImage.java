package app.proxy.proxy;

import app.proxy.image.IImage;
import app.proxy.image.RealImage;

public class ProxyImage implements IImage {
    public RealImage myProxyImage;
    public String fileName;

    public ProxyImage(String name) {
        this.fileName = name;
    }

    /**
     * Mostra a imagem
     */
    @Override
    public void display() {
        if (myProxyImage == null) {
            myProxyImage = new RealImage(fileName);
        }
        myProxyImage.display();
    }

    @Override
    public void showImageProperties() {
        myProxyImage.showImageProperties();
    }

}