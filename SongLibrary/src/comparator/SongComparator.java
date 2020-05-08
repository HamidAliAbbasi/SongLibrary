package comparator;

import java.util.Comparator;

import objects.Song;

/**
 * @author      Omar Atieh
 * @author		Hamid Abbasi
 */
public class SongComparator implements Comparator<Song>{

	/**
	 * New comparator for songs
	 * 
	 * @param song1			the first song
	 * @param song2			the second song
	 * @return				less than 0 if song1 is earlier in the alphabet, else if song1 appears after song2
	 */
	@Override
	public int compare(Song song1, Song song2) {
		return song1.getTitle().toLowerCase().compareTo(song2.getTitle().toLowerCase());
	}
}
