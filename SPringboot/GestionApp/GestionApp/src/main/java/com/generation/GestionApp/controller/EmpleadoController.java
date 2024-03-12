package com.generation.GestionApp.controller;
import com.generation.GestionApp.model.Empleado;
import com.generation.GestionApp.services.EmpleadoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;


@Controller
@AllArgsConstructor
@RequestMapping("/empleados")
public class EmpleadoController {

    private final EmpleadoServiceImpl empleadoService;

    @GetMapping("/lista")
    public String mostrarListaEmpleados(Model model){
        //llamamos al service para que nos traiga una lista de empleados atraves del repository y se
        // guarda en una variable
        List<Empleado> listaEmpleados = empleadoService.listarEmpleados();
        //al model para pasar a la vista le asignamos el valor de la variable
        model.addAttribute("empleados", listaEmpleados);
        return "lista";
    }

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model){
        model.addAttribute("empleado", new Empleado());
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardarNuevoEmpleado(@ModelAttribute Empleado nuevoEmpleado){
        empleadoService.guardarEmpleado(nuevoEmpleado);
        return "redirect:/empleados/lista";
    }
}
