package br.edu.cesmac.si.nolapi.resources;

import br.edu.cesmac.si.nolapi.domain.Editoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EditoriaResource {
    @GetMapping(path = "/editorias")
    public List<Editoria>

}
