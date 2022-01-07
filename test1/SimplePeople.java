package test1;

public class SimplePeople implements People {
    private String name;
    private String gender;
    private int age;

    SimplePeople(String name, String gender, int age){
        this.name =name;
        this.gender=gender;
        this.age=age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void sit(Chair chair) {
        chair.setPeople(this);
    }

    @Override
    public void stand(Chair chair) {
        chair.setPeople(null);
    }
}
