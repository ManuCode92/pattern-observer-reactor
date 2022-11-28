package com.nttdata.taller4jmbj.patternobserverreactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Flux y Mono
 * @author jmbj
 *
 */
public class PatternObserverReactorApplication {

	public static void main(String[] args) {

		Flux<String> publisher = Flux.just("Mensaje1", "Mansaje2", "Mensaje3");

		System.out.println("Flux");
		publisher.subscribe(m -> System.out.println("Consumer1, recibido" + m),
				e -> System.out.println("Ha habido un error" + e.getMessage()),
				() -> System.out.println("Consumer1, ha terminado"));
		publisher.subscribe(m -> System.out.println("Consumer2, recibido" + m),
				e -> System.out.println("Ha habido un error" + e.getMessage()),
				() -> System.out.println("Consumer2 , ha terminado"));
		
		
		System.out.println("Mono");
		Mono<String> publisherMono = Mono.just("Mensaje1");
		publisherMono.subscribe(m -> System.out.println("Consumer1, recibido" + m),
				e -> System.out.println("Ha habido un error" + e.getMessage()),
				() -> System.out.println("Consumer1, ha terminado"));
		publisherMono.subscribe(m -> System.out.println("Consumer2, recibido" + m),
				e -> System.out.println("Ha habido un error" + e.getMessage()),
				() -> System.out.println("Consumer2 , ha terminado"));
	}

}
