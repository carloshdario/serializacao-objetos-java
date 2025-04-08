package desafio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

public class Serializacao {
    public static void main(String[] args) {

     Cliente cliente = new Cliente("Carlos", new Endereco("Rua do jose", 200, "Centro"),new BigDecimal(2000));
        System.out.println(cliente);

    Path path = Path.of("objetos/cliente.ser");

    try(var objeto = new ObjectOutputStream(Files.newOutputStream(path, WRITE, CREATE))) {
        objeto.writeObject(cliente);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

    }
}
