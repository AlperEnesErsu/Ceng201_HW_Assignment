public class Patient {
    int id;
    String name;
    int severity;
    int age;
    Patient next;
    //Requirements for patients

    public Patient(int id,String name,int severity,int age) {
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;
        this.next = null;
    }
    public String toString(){
        return "ID: " + id + ", Name: " + name + ", Age: " + age +", Severity: " + severity;
    }
}


