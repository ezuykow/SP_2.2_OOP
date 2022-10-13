package transport;

import driver.Driver;
import mechanic.Mechanic;
import sponsor.Sponsor;

import java.util.List;

public abstract class Transport {
    private static final String DEFAUL_VALUE = "<no info>";

    private String brand;
    private String model;
    private float engineVolume;
    protected boolean diagnosticCarried;

    private Driver<?> driver;
    private List<Sponsor> sponsors;
    private List<Mechanic> mechanics;


    protected Transport(String brand, String model, float engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    protected abstract void startMoving();

    protected abstract void endMoving();

    public abstract void diagnostic();


    public Driver<?> getDriver() {
        return driver;
    }

    public void setDriver(Driver<?> driver) {
        this.driver = driver;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public void setSponsors(List<Sponsor> sponsors) {
        this.sponsors = sponsors;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public boolean getDiagnosticCarried() {
        return diagnosticCarried;
    }

    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        this.brand = ((brand == null) || (brand.isBlank()))
                ? DEFAUL_VALUE
                : brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = ((model == null) || (model.isBlank()))
                ? DEFAUL_VALUE
                : model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = Math.max(engineVolume, 0.5F);
    }
}
