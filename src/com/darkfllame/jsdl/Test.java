package com.darkfllame.jsdl;

import static com.darkfllame.jsdl.NativeBindings.*;
import com.darkfllame.jsdl.*;

public class Test {
	public static void main(String[] args) {
		SDL_Init(InitFlags.InitEverything);
		
		long window   = SDL_CreateWindow("",SDL_WINDOWPOS_CENTERED, SDL_WINDOWPOS_CENTERED, 800, 600, 0);
		long renderer = SDL_CreateRenderer(window, -1, RendererFlags.RendererPresentVSync | RendererFlags.RendererSoftware);
		
		Event event = new Event();
		boolean running = true;
		
		while (running) {
			SDL_SetRenderDrawColor(renderer, 0, 0, 0, 255);
			SDL_RenderClear(renderer);
			
			SDL_SetRenderDrawColor(renderer, 255, 0, 0, 255);
			SDL_RenderFillRect(renderer, 0, 0, 100, 100);
			
			SDL_RenderPresent(renderer);

			while(SDL_PollEvent(event) > 0) {
				if (event.type == EventType.Quit)
					running = false;
			}
		}
	
		SDL_DestroyWindow(window);
		SDL_DestroyRenderer(renderer);
		SDL_Quit();
	}
}
