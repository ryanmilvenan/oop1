class DVD extends Media implements Comparable<Media>
{
    private int year;
    public DVD(String title, int year)
    {
        this.title = title;
        this.year = year;
    }
	public int getYear() 	 { return year;  }
    public String toString()
    {
        return year + ": " + title + " [DVD]";
	}
    
    public int compareTo(Media other) {
    	//Comparing to another DVD
    	if(other instanceof DVD) {
    		//Title Comparison
    		int titleComparison = this.title.compareTo(other.title);
    		if(titleComparison == 0) {
    			return Integer.compare(this.year, ((DVD)other).year);
    		} else {
    			return titleComparison;
    		}
    	} 
    	//Comparing to a Book
    	else if(other instanceof Book){
    		return -1;
    	} else {
    		return this.title.compareTo(other.title);
    	}
    }
}
