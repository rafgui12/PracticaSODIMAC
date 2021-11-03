import java.util.Arrays;
import java.util.List;

class Concurrencia {
    public static void main(String[] args) {
        List<String> tareas = Arrays.asList("tarea1","tarea2","tarea3");
        List<CompletetableFuture<Void>> futuros = tareas.stream()
        .map(tareas::join)
        .collect(collector.toList());
        
        futuros.stream().map(CompletetableFuture::join).collect(Collectors.toList());

    }

    public static void tarea(String nombre){
        String mensaje = "Ejecutando tarea"+nombre;
        System.out.println(mensaje);
    }

}