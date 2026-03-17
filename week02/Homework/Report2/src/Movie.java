public class Movie {
    private String title;
    private String director;
    private int open;
    private String mainActor;
    private float rankPoint;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getOpen() {
        return open;
    }

    public void setOpen(int open) {
        this.open = open;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public float getRankPoint() {
        return rankPoint;
    }

    public void setRankPoint(float rankPoint) {
        this.rankPoint = rankPoint;
    }

    public Movie(String title, String director, int open, String mainActor, float rankPoint) {
        this.title = title;
        this.director = director;
        this.open = open;
        this.mainActor = mainActor;
        this.rankPoint = rankPoint;
    }

    @Override
    public String toString() {
        String LastFirstname[] = director.split(" ");
        for (int i=0;i<LastFirstname.length;i++){
            if (i==0){
                System.out.println("성 : "+LastFirstname[i]);
            }else if (i==1){
                System.out.println("이름 : "+LastFirstname[i]);
            }

        }
        return String.format("\n제목 : %s\n감독 : %s\n개봉 : %d\n주연 : %s\n평점 : %.1f",title,director,open,mainActor,rankPoint);
    }
}
