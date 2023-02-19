public class Reddit implements Comparable<Throwable> {
    String title;

    int votes;

    public Reddit(String title, int votes){
        this.title = title;
        this.votes = votes;
    }

    @Override
    public int compareTo(Throwable o) {
        return 0;
    }
}
