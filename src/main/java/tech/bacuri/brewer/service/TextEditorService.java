package tech.bacuri.brewer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import tech.bacuri.brewer.model.Usuario;


@RequiredArgsConstructor
@Component
public class TextEditorService {
    private final TemplateEngine thymeleaf;

    public String obterTemplate(Usuario usuario) {
        Context context = new Context();
        context.setVariable("usuario", usuario);

        return thymeleaf.process("textarea/teste1", context);
    }
}
