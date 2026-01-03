package pl.pcemekm.webBook.modularity.helpdesk;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.pcemekm.webBook.modularity.Module;

@Configuration
@ComponentScan(basePackages = "pl.pcemekm.webBook.modularity.helpdesk")
public class HelpdeskModule implements Module {
    
    @Override
    public String getName() {
        return "Helpdesk";
    }
}
