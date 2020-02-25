package app.controle.principal;

import app.controle.image.IImage;
import app.controle.proxy.ProxyImage;

/**
O padrão Proxy está mais ligado a prover um objeto para servir como intermediário na comunicação com um outro principal.

The proxy could interface to anything: a network connection, a large object in memory, a file, or some other resource that is expensive or 
impossible to duplicate. In short, a proxy is a wrapper or agent object that is being called by the client to access the real serving object behind the scenes.
 Use of the proxy can simply be forwarding to the real object, or can provide additional logic.
*/
public class App {    
    public static void main(String[] args) {
        System.out.println("Usando o padrao Proxy");

        IImage myImage = new ProxyImage("arquitetura-do-docker.png");

        myImage.display(); 
        myImage.showImageProperties();
    }
}