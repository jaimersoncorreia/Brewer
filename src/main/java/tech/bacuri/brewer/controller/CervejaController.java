package tech.bacuri.brewer.controller;


import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import tech.bacuri.brewer.model.Cerveja;

@Controller
@RequestMapping("/cervejas")
public class CervejaController {

    @GetMapping("/novo")
    public String novo(Model model) {

        return "cerveja/CadastroCerveja";
    }

    @PostMapping("/novo")
    public String cadastrar(@Valid Cerveja cerveja,
                            BindingResult result,
                            Model model,
                            RedirectAttributes attributes) {

        if (result.hasErrors()) {
            model.addAttribute(cerveja);
            return novo(model);
        }

        // Salvar no banco de dados...
        attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
        System.out.println(">>> sku: " + cerveja.getSku());
        return "redirect:/cervejas/novo";
    }

    @GetMapping("/cadastro-produto")
    public String cadastroProduto(Model model) {

        return "cerveja/cadastro-pro duto";
    }
}
