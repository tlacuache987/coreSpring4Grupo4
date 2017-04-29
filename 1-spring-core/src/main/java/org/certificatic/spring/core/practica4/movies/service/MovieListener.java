package org.certificatic.spring.core.practica4.movies.service;

import org.certificatic.spring.core.practica4.movies.api.IMovieFinder;
import org.certificatic.spring.core.practica4.movies.api.impl.MovieFinderImpl;
import org.certificatic.spring.core.practica4.movies.model.Movie;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MovieListener {

	private IMovieFinder movieFinder;

	public Movie buscarPelicula(String titulo) {

		Movie m = movieFinder.find(titulo);

		return m;
	}
}
