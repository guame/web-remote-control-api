package guame.rmtctrl;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by guam on 28.06.2017.
 */

@Controller
public class GreetingController {
	
	@MessageMapping("/rmtctrl")
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage message) throws Exception {
		Thread.sleep(1000); // simulated delay
		return new Greeting("Hello, " + message.getName() + "!");
	}
	
}
