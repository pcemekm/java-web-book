package pl.pcemekm.webBook.modularity.user;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.pcemekm.webBook.modularity.Module;

@Configuration
@ComponentScan(basePackages = "pl.pcemekm.webBook.modularity.user")
public class UserModule implements Module {
    
    @Override
    public String getName() {
        return "User";
    }
}

