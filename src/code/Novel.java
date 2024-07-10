/**
 * Represents a novel with a bookTitle, author name, and year published.
 *
 * @author Mbadaliga Arehone Brenden and Ravhuravhu Junior Khuliso
 * @version 1.0
 */
public class Novel
{
    private final String title;
    private final String author_Name;
    private final int year_Published;

    /**
     * Constructs a Novel object with the specified bookTitle, author name, and year published.
     *
     * @param title     the bookTitle of the novel
     * @param author_Name    the author's name
     * @param year_Published the year the novel was published
     */
    public Novel(final String title,
                 final String author_Name,
                 final int year_Published)
    {
        this.title = title;
        this.author_Name = author_Name;
        this.year_Published= year_Published;
    }

    /**
     * @return the title of the novel
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * @return the author's name
     */
    public String getAuthor_Name()
    {
        return author_Name;
    }

    /**
     * @return the year the novel was published
     */
    public int getYear_Published()
    {
        return year_Published;
    }

    /**
     * Returns a string representation of the object. In this case, it returns a formatted string
     * containing the title, author, and year of publication.
     *
     * @return A string representation of the object in the format "Title: [title], Author: [author], Year: [year]".
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author_Name + ", Year: " + year_Published;
    }
}
