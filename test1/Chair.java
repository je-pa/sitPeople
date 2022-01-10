package test1;

public interface Chair {
    int getLegsNum();
    String getColor();
    String getBrand();
    People whoisSitting();

    void setPeople(People people);
}
