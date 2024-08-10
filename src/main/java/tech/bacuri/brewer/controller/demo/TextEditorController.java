package tech.bacuri.brewer.controller.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tech.bacuri.brewer.model.Usuario;
import tech.bacuri.brewer.service.TextEditorService;

import java.time.LocalDate;
import java.time.Month;

@RequiredArgsConstructor
@Controller
@RequestMapping("/text-editor")
public class TextEditorController {
    private final TextEditorService textEditorService;

    @GetMapping(value = {"/", ""})
    public ModelAndView index() {

        Usuario usuario = Usuario.builder()
                .nome("Julia Débora Fernandes")
                .email("julia.debora.fernandes@virage.com.br")
                .nascimento(LocalDate.of(1999, Month.JANUARY, 5))
                .status("ATIVO")
                .build();
        String textarea = textEditorService.obterTemplate(usuario);

        ModelAndView modelAndView = new ModelAndView("text-editor/teste1");
        modelAndView.addObject("textarea", textarea);
        return modelAndView;
    }

    @GetMapping("/teste1")
    public ModelAndView teste1() {
        return new ModelAndView("text-editor/teste1");
    }
}
