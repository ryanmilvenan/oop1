class Book extends Media implements Comparable<Media>
{
    private String author;
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
	public String getAuthor() { return author; }
    public String toString()
    {
        return getTitle() + " by " + getAuthor();
	}
    
    public int compareTo(Media other) {
    	//Comparing to another book
    	if(other instanceof Book) {
    		int titleComparison = this.title.compareTo(other.title);
    		if(titleComparison == 0) {
    			return this.author.compareTo(((Book)other).author);
    		} else {
    			return titleComparison;
    		}
    	} 
    	//Comparing to a DVD
    	else if(other instanceof DVD){
    		return 1;
    	} else {
    		return this.title.compareTo(other.title);
    	}
    }
}

