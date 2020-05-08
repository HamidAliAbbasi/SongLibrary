# SongLibrary
A Song library application for storing and organizing music. 



An application with a graphical user interface to manage a library of songs. Application has a SINGLE WINDOW with three functions:

1. Song list display, with the ability to select ONE song from the list.

   The list displays the name and artist for each song, in **alphabetical order of names** (and **within duplicate names, by alphabetical order of artists**). Unless the list is empty, one song is always pre-selected, and its details shown - see the following item.

   

2. Song detail, with name, artist, album, and year, of the song that is selected in the song list interface

   

3. Song Add/Delete/Edit, for adding a new song, deleting a selected song, and editing a selected song:

   - 

   - Add: When a new song is added, the song name and artist are entered at the very least. Year and album are optional. If the name and artist are the same as an existing song, the add is not allowed - a message is shown in a pop-up dialog

     The newly added song is automatically placed in the correct position in the alphabetical order in the list. Also, it is automatically selected, replacing the previously selected song, and its details are shown.

     

   - Edit: ANY of the fields can be changed. Again, if name and artist conflict with those of an existing song, the edit is allowed - a message is shown in a pop-up dialog.

     

   - **Delete**: Only the selected song in the list can be deleted. After deletion, the next song in the list is selected, and the details displayed. If there is no next song, the previous song is selected, and if there is no previous song either, then the list is empty and the detail info is all blanks.

   For any of the add/delete/edit actions, the user is able to cancel (or back out of) the action if they change their mind after starting the action.