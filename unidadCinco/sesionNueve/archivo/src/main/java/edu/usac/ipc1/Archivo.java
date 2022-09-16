package edu.usac.ipc1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Archivo {

    private File file;

    public Archivo(String ruta) {
        // Inicializa un objeto file
        // Este objeto almacena una referencia a un archivo
        file = new File(ruta);
    }

    /**
     * 
     * @return
     */
    public Path getPath() {
        if (file != null && file.isFile()) {
            return file.toPath();
        }
        return null;
    }

    /**
     * Crea el archivo
     */
    public boolean crear() {
        try {
            return file.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    /**
     * Crea un directorio
     */
    public void crearDirectorio() {
        try {
            if (file.mkdirs()) {
                System.out.println(file.getPath() + " creado");
            } else {
                System.out.println(file.getPath() + " no se pudo crear");
            }
        } catch (SecurityException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Obtiene la información del archivo
     */
    public String informar() {
        StringBuilder sBuilder = new StringBuilder();
        if (file != null && file.exists()) {
            sBuilder.append(String.format("Name: %5s", file.getName())).append("\n");
            sBuilder.append(String.format("Absolute path: %5s", file.getAbsolutePath())).append("\n");
            if (file.isDirectory()) {
                sBuilder.append(String.format("%5s", file.isDirectory())).append("\n");
                sBuilder.append(String.format("%5s", file.getTotalSpace())).append("\n");
                sBuilder.append(String.format("%5s", file.getUsableSpace())).append("\n");
            }
        } else {
            return "No hay archivo creado";
        }
        return sBuilder.toString();
    }

    /**
     * Elimina un archivo
     */
    public boolean eliminar() {
        try {
            return file.delete();
        } catch (SecurityException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    /**
     * Escribir a un archivo
     *
     * @param contenido
     */
    public String escribir(String contenido) {
        if (file.exists() && file.canWrite()) {
            BufferedWriter bWriter = null;
            boolean flag = false;
            try {
                bWriter = Files.newBufferedWriter(getPath(), StandardCharsets.UTF_8);
                bWriter.append(contenido);
                flag = true;
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            } finally {
                if (bWriter != null) {
                    try {
                        bWriter.close();
                    } catch (IOException e) {

                    }
                }
            }
            return flag ? "Archivo guardado exitosamente" : "No se puede guardar el archivo";
        } else {
            return "No se puede escribir a " + file.getName();
        }
    }

    /**
     * Leer contenido de archivo
     */
    public String leer() {
        StringBuilder sb = new StringBuilder();
        if (file.exists() && file.canRead()) {
            BufferedReader bReader = null;
            try {
                bReader = Files.newBufferedReader(getPath(), StandardCharsets.UTF_8);
                String line;
                while ((line = bReader.readLine()) != null) {
                    sb.append(line);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                if (bReader != null) {
                    try {
                        bReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return sb.toString();
    }
}