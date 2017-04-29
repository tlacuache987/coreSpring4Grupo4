package org.certificatic.spring.core.practica4.movies.api;

import org.certificatic.spring.core.practica4.movies.model.Movie;

public interface IMovieFinder {
	
	Movie find(String titulo);
}
