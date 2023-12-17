package com.mulhermarav.propriedade;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PropriedadeController {


    private final PropriedadeRepository repository;

    @GetMapping("/find")
    List<Propriedade> findByFiltro(@RequestParam("filtro") String filtro) {
        return repository.findByFiltro(filtro);
    }
}
