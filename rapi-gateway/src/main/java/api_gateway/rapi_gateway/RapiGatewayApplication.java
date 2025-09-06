package api_gateway.rapi_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RapiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RapiGatewayApplication.class, args);
	}

}
