/*
*
* This class implements a library of songs
*
* @author CS111 - Rutgers University
*
*/
public class SongApp {

  private Song[] items;      // keep Songs in an unsorted array
  private int numberOfItems; // number of Songs in the array
  private int[] listens;

  /*
  * Default constructor creates array with capacity for 5 Songs
  */
  SongApp () {
      items = new Song[5];
      numberOfItems = 0;
      listens = new int[5];
    }

    /*
    * One argument constructor creates array with user defines capacity
    *
    * @param capacity defines the capacity of the Song library
    */
    SongApp (int capacity) {
        items = new Song[capacity];
        numberOfItems = 0;
        listens = new int[capacity];
    }

    /*
    * Add a Song into the library (unsorted array)
    *
    * If the library is full (there is not enough space to add another Song)
    *   - create a new array with double the size of the current array.
    *   - copy all current Songs into new array
    *   - add new Song
    *
    * @param m The Song to be added to the libary
    */
    public int getNumberListens(String songName){
      int index = -1;
      for(int i = 0; i < this.getNumberOfItems(); i++){
        if(items[i].getName().compareTo(songName) == 0){
          index = i;
          break;
        }
      }
      if(index == -1) return -1;
      else return listens[index];
    }

    public void listenTo(String songName){
      int index = -1;
      for(int i = 0; i < this.getNumberOfItems(); i++){
        if(items[i].getName().compareTo(songName) == 0){
          index = i;
        }
      }
      listens[index]++;
    }

    public void addSong (Song m) {
        if((numberOfItems+1) < items.length){
          items[numberOfItems] = m;
          listens[numberOfItems] = 0;
          numberOfItems++;

        }
        else{
          Song[] newItems = new Song[(items.length*2)];
          int[] newListens = new int[(listens.length)*2];
          for(int i = 0; i < items.length; i++){
            newItems[i] = items[i];
            newListens[i] = listens[i];
          }
          items = new Song[newItems.length];
          listens = new int[newListens.length];
          for(int i = 0; i < newItems.length; i++){
            items[i] = newItems[i];
            listens[i] = newListens[i];
          }
          items[numberOfItems] = m;
          listens[numberOfItems] = 0;
          numberOfItems++;
        }
    }

    /*
    * Removes a Song from the library. Returns true if Song is removed, false
    * otherwise.
    * The array should not become sparse after a remove, that is, all Songs
    * should be in consecutive indexes in the array.
    *
    * @param m The Song to be removed
    *
    */
    public boolean removeSong (Song m) {
      int placeholder = -99;
      boolean success = false;
      for(int i = 0; i < items.length; i++){
        if((items[i].compareTo(m) == 0) && (items[i].equals(m))){
          placeholder = i;
          break;
        }
      }
      if(placeholder == -99) success = false;
      else{
        items[placeholder] = null;
        for(int i = placeholder; i < items.length; i++){
          if(items[i+1] == null){
            items[i] = null;
            break;
          }
          else{
            items[i] = items[i+1];
          }
        }
        success = true;
        numberOfItems--;
      }
      return success;
    }

    /*
    * Returns the library of songs
    *
    * @return The array of Songs
    */
    public Song[] getSongs () {
        return this.items;
    }

    /*
    * Returns the current number of Songs in the library
    *
    * @return The number of items in the array
    */
    public int getNumberOfItems () {
        return this.numberOfItems;
    }

    /*
    * Update the rating of Song @m to @rating
    *
    * @param @m The Song to have its ratings updated
    * @param @rating The new rating of @m
    * @return true if update is successfull, false otherwise
    *
    */
    public boolean updateRating (Song m, int rating) {
        if(rating > 0 && rating < 6){
          m.setRating(rating);
          return true;
        }
        else{
          return false;
        }
    }

    /*
    * Prints all Songs
    */
    public void print () {
        for(int i = 0; i < items.length; i++){
            System.out.println(items[i]);
          }
        }

    /*
    * Return all the Songs by @songwriter. The array size should be the
    * number of Songs by @songwriter.
    *
    * @param songwriter The songwriter's name
    * @param An array of all the Songs by @songwriter
    *
    */
    public Song[] getSongsBySongwriter (String songwriter) {
      int counter = 0;
      int place = 0;
      Song[] temp = new Song[50];
      for(int i = 0; i < this.getNumberOfItems(); i++){
        String[] stringTemp = new String[this.items[i].getNumberOfWriters()];
        for(int j = 0; j < this.items[i].getNumberOfWriters();j++){
          stringTemp[j] = this.items[i].getWriterAtIndex(j);
        }
        for(int k = 0; k < stringTemp.length; k++){
          if(stringTemp[k].equals(songwriter)){
            temp[counter] = items[i];
            counter++;
            break;
          }
        }
      }
      for(int i = 0; i < temp.length; i++){
        if(temp[i+1] == null){
          place = i+1;
          break;
        }
      }
      Song[] toReturn = new Song[place];
      for(int i = 0; i < place; i++){
        toReturn[i] = temp[i];
      }
      if(toReturn[0] == null) toReturn = new Song[0];
      return toReturn;
      }
    /*
    * Return all the Songs released in @year. The array size should be the
    * number of Songs made in @year.
    *
    * @param year The year the Songs were made
    * @return An array of all the Songs made in @year
    *
    */
    public Song[] getSongsByYear (int year) {
      int counter = 0;
      Song[] newItems = new Song[items.length];
      for(int i = 0; i < this.getNumberOfItems(); i++){
        if(items[i].getYear() == year){
          newItems[counter] = items[i];
          counter++;
        }
      }
      counter = 0;
      for(int i = 0; i < newItems.length; i++){
        if(newItems[i] == null){
          counter = i;
          break;
        }
      }
      Song superNewItems[] = new Song[counter];
      for(int i = 0; i < counter; i++){
        superNewItems[i] = newItems[i];
      }
      return superNewItems;
    }

    /*
    * Return all the Songs with ratings greater then @rating
    *
    * @param rating
    * @return An array of all Songs with rating greater than @rating
    *
    */
    public Song[] getSongsWithRatingsGreaterThan (int rating) {
        int counter = 0;
        Song[] newItems = new Song[items.length];
        for(int i = 0; i < this.getNumberOfItems(); i++){
          if(items[i].getRating() > rating){
            newItems[counter] = items[i];
            counter++;
          }
        }
        counter = 0;
        for(int i = 0; i < newItems.length; i++){
          if(newItems[i] == null){
            counter = i;
            break;
          }
        }
        Song superNewItems[] = new Song[counter];
        for(int i = 0; i < counter; i++){
          superNewItems[i] = newItems[i];
        }
        return superNewItems;
    }

    /*
    * Search for Song name @name using binary search algorithm.
    * Assumes items is sorted
    */
    public Song searchSongByName (String name) {
      Song temp = new Song("de");
      for(int i = 0; i < this.getNumberOfItems(); i++){
        if(items[i].getName().compareTo(name) == 0){
          temp = items[i];
        }
      }
      if(temp.getName().compareTo("de") == 0){
        temp = null;
      }
      return temp;
    }

   /*
    * Sorts Songs by year using insertion sort
    */
    public void sortByYear () {
      for(int i = 1; i < this.getNumberOfItems(); i++){
        Song temp = items[i];
        int j;
        for(j = i - 1; j >= 0 && temp.getYear() < items[j].getYear(); j--){
        items[j+1] = items[j];
        }
        items[j+1] = temp;
        }
      }

   /*
    * Sorts array of Songs by name using selection sort
    */
    public void sortByName () {
      int maxindex = 0;
      Song temp = new Song("despacito");
        for(int i = 0; i < this.getNumberOfItems(); i++){
          int n = i+1, min = 0;
          while(n < this.getNumberOfItems()){
            int compared = items[i].compareTo(items[n]);
            if(compared < min){//negative number
              min = compared;
              maxindex = n;
              n++;
            }
            else{
              n++;
            }
          }
          temp = items[i];
          items[i] = items[maxindex];
          items[maxindex] = temp;
        }
        Song[] temp1 = new Song[this.getNumberOfItems()];
        for(int i = 0; i < this.getNumberOfItems(); i++){
          temp1[i] = items[this.getNumberOfItems()-i-1];
        }
        for(int i = 0; i < this.getNumberOfItems(); i++){
          items[i] = temp1[i];
        }
        for(int i =0; i < this.getNumberOfItems(); i++){
          if(items[i+1] == null) break;
          else if(items[i].getName().compareTo(items[i+1].getName()) > 0){
            Song temp2 = items[i];
            items[i] = items[i+1];
            items[i+1] = temp2;
          }
        }
        for(int i =0; i < this.getNumberOfItems(); i++){
          if(items[i+1] == null) break;
          else if(items[i].getName().compareTo(items[i+1].getName()) > 0){
            Song temp2 = items[i];
            items[i] = items[i+1];
            items[i+1] = temp2;
          }
        }
        for(int i =0; i < this.getNumberOfItems(); i++){
          if(items[i+1] == null) break;
          else if(items[i].getName().compareTo(items[i+1].getName()) > 0){
            Song temp2 = items[i];
            items[i] = items[i+1];
            items[i+1] = temp2;
          }
        }
      }

   /*
    * Search for Song name using recursive linear search
    * @param name The name of the song to search
    * @param Songs The array containing all songs
    * @param l The left index
    * @param r The right index
    * @return The song with name @name or null if song is not found
    */
    public static Song searchSongByName (String name, Song[] Songs, int l, int r) {
      if(r <= l) return null;
      else if(name.compareTo(Songs[l].getName()) == 0) return Songs[l];
      else if(Songs[l+1] == null) return null;
      else return searchSongByName(name, Songs, l+1, r);
    }
  }
