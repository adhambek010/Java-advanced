import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.advanced.car.Corolla;
import com.advanced.car.Swift;
import com.advanced.specs.EngineType;

@Configuration
@ComponentScan("com.advanced")
public class AppConfig {
	
	@Bean("corolla")
	public Corolla corolla() {
		return new Corolla();
	}
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
	
	@Bean("UnknownEngine")
	public EngineType engineType() {
		return new EngineType();
	}
	
	@Bean("v6Engine")
	public EngineType v6Type() {
		return new EngineType("V6 Engine");
	}
}
