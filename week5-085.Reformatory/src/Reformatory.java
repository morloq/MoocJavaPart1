public class Reformatory {
    private int counter;
    public int weight(Person person)
    {
        this.counter ++;
        return person.getWeight();
    }
    public void feed(Person person)
    {
        int weight = person.getWeight();
        person.setWeight(weight +1);
    }
    public int totalWeightsMeasured()
    {
           return counter;
    }
}
