package mechanic;

public class Mechanic {

    private String name;
    private String company;
    private TargetTransport[] target;

    public Mechanic(String name, String company, TargetTransport[] target) {
        setCompany(company);
        setTarget(target);
        setName(name);
    }

    public void carryOutMaintenance() {
        //??
    }

    public void repairTransport() {
        //??
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ((name == null) || (name.isBlank())) {
            throw new IllegalArgumentException("Illegal mechanic`s name");
        }
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if ((company == null) || (company.isBlank())) {
            throw new IllegalArgumentException("Illegal company name");
        }
        this.company = company;
    }

    public TargetTransport[] getTarget() {
        return target;
    }

    public void setTarget(TargetTransport[] target) {
        this.target = target;
    }
}
