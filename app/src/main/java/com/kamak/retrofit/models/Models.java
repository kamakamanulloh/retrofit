package com.kamak.retrofit.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class Models{

	@SerializedName("povCharacters")
	private List<String> povCharacters;

	@SerializedName("country")
	private String country;

	@SerializedName("characters")
	private List<String> characters;

	@SerializedName("numberOfPages")
	private int numberOfPages;

	@SerializedName("isbn")
	private String isbn;

	@SerializedName("name")
	private String name;

	@SerializedName("publisher")
	private String publisher;

	@SerializedName("mediaType")
	private String mediaType;

	@SerializedName("url")
	private String url;

	@SerializedName("released")
	private String released;

	@SerializedName("authors")
	private List<String> authors;

	public void setPovCharacters(List<String> povCharacters){
		this.povCharacters = povCharacters;
	}

	public List<String> getPovCharacters(){
		return povCharacters;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setCharacters(List<String> characters){
		this.characters = characters;
	}

	public List<String> getCharacters(){
		return characters;
	}

	public void setNumberOfPages(int numberOfPages){
		this.numberOfPages = numberOfPages;
	}

	public int getNumberOfPages(){
		return numberOfPages;
	}

	public void setIsbn(String isbn){
		this.isbn = isbn;
	}

	public String getIsbn(){
		return isbn;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPublisher(String publisher){
		this.publisher = publisher;
	}

	public String getPublisher(){
		return publisher;
	}

	public void setMediaType(String mediaType){
		this.mediaType = mediaType;
	}

	public String getMediaType(){
		return mediaType;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setReleased(String released){
		this.released = released;
	}

	public String getReleased(){
		return released;
	}

	public void setAuthors(List<String> authors){
		this.authors = authors;
	}

	public List<String> getAuthors(){
		return authors;
	}


}